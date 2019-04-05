package com.dicoding.konversimatauang;
import java.text.NumberFormat;
import java.util.Locale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RupiahKeDollar extends AppCompatActivity implements View.OnClickListener{
    TextView tvData2, tvHasil1;
    Button btnRtD;
    EditText edtRtD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupiah_ke_dollar);

        tvData2=findViewById(R.id.tv_data2);
        tvHasil1=findViewById(R.id.tv_hasil1);
        btnRtD=findViewById(R.id.btn_RtD);
        edtRtD=findViewById(R.id.edt_RtD);
        btnRtD.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_RtD){
            int nRupiah = Integer.parseInt(edtRtD.getText().toString());
            double ndollar = nRupiah/14000.0;
            NumberFormat kurensiUs = NumberFormat.getCurrencyInstance(Locale.US);
            String moneyString  = kurensiUs.format(ndollar);
            tvHasil1.setText(String.valueOf(moneyString));
        }
    }
}
