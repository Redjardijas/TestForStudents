package com.example.soc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HistActivity extends AppCompatActivity implements View.OnClickListener {
    Button bRann, bPozdn, bKont, bSpencer, bMarx, bsor, btard, btonn, bveb, bmert, b20, bpars, bdurkh, b21;
    //TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist);

        bRann = findViewById(R.id.brann);
        bPozdn = findViewById(R.id.bpozdn);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        bKont = findViewById(R.id.bkont);
        bMarx = findViewById(R.id.bmarx);
        bSpencer = findViewById(R.id.bspencer);
        bveb = findViewById(R.id.bveb);
        btard = findViewById(R.id.btard);
        btonn = findViewById(R.id.btonnis);
        bmert = findViewById(R.id.bmerton);
        bsor = findViewById(R.id.bsorokin);
        bdurkh = findViewById(R.id.bdurk);
        bpars = findViewById(R.id.bparsons);

        bRann.setOnClickListener(this);
        bPozdn.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        bPozdn.setOnClickListener(this);
        bKont.setOnClickListener(this);
        bSpencer.setOnClickListener(this);
        bMarx.setOnClickListener(this);
        bsor.setOnClickListener(this);
        bmert.setOnClickListener(this);
        btonn.setOnClickListener(this);
        btard.setOnClickListener(this);
        bveb.setOnClickListener(this);
        bdurkh.setOnClickListener(this);
        bpars.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.brann:
                CustomToast.makeText(this, R.string.list1).show();
                break;
            case R.id.bpozdn:
                CustomToast.makeText(this, R.string.list2).show();
                break;
            case R.id.b20:
                CustomToast.makeText(this, R.string.list3).show();
                break;
            case R.id.b21:
                CustomToast.makeText(this, R.string.list4).show();
                break;
            case R.id.bkont:
                CustomToast.makeText(this, R.string.kont).show();
                break;
            case R.id.bmarx:
                CustomToast.makeText(this, R.string.marx).show();
                break;
            case R.id.bspencer:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.bsorokin:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.bmerton:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.btard:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.bveb:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.btonnis:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.bdurk:
                CustomToast.makeText(this, R.string.spencer).show();
                break;
            case R.id.bparsons:
                CustomToast.makeText(this, R.string.spencer).show();
                break;

        }
    }
}