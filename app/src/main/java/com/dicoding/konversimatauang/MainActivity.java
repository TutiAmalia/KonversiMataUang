package com.dicoding.konversimatauang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnMoveRtD, btnMoveDtR;
    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveDtR=findViewById(R.id.btn_moveDtoR);
        btnMoveRtD=findViewById(R.id.btn_moveRtoD);
        tvData=findViewById(R.id.tv_data);
        btnMoveDtR.setOnClickListener(this);
        btnMoveRtD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_moveDtoR:
                Intent moveDtR = new Intent(MainActivity.this, DollarKeRupiah.class);
                startActivity(moveDtR);
                break;
            case R.id.btn_moveRtoD:
                Intent moveRtD = new Intent(MainActivity.this, RupiahKeDollar.class);
                startActivity(moveRtD);
                break;
        }

    }
}
