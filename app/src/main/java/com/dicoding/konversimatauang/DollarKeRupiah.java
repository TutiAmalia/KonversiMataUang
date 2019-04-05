package com.dicoding.konversimatauang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class DollarKeRupiah extends AppCompatActivity implements View.OnClickListener{
        TextView tvData1, tvHasil;
        Button btnDtR;
        EditText edtDtR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar_ke_rupiah);

        tvData1=findViewById(R.id.tv_data1);
        tvHasil=findViewById(R.id.tv_hasil);
        btnDtR=findViewById(R.id.btn_DtR);
        edtDtR=findViewById(R.id.edt_DtR);
        btnDtR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_DtR){
            int ndollar = Integer.parseInt(edtDtR.getText().toString());
            double nrupiah = ndollar*14000;
            String rupiahString = String.format("Rp.%,.0f",nrupiah).replaceAll(",",".")+",00";
            tvHasil.setText(String.valueOf(rupiahString));
        }
    }
}
