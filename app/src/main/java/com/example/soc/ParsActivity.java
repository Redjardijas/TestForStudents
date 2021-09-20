package com.example.soc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import static com.example.soc.R.id.*;

public class ParsActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textins, textins2, textins3, textins4;
    ImageView [] ims;
    ImageView /*rimagIm, rimagIm2, rimagIm3, rimagIm4, rimagIm5, rimagIm6, rimagIm7, rimagIm8, rimagIm9, rimagIm10, rimagIm11, rimagIm12,*/ imagIm, imagIm2, imagIm3, imagIm4, imagIm5, imagIm6, imagIm7, imagIm8, imagIm9, imagIm10, imagIm11, imagIm12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pers);
     // textIDs = new int[] {textinside, textinside2, textinside3, textinside4};
      /* ims = new ImageView[]{(ImageView) findViewById(durkhaim),
                (ImageView) findViewById(pareto),
                (ImageView) findViewById(kont)};*/

       /* rimagIm = (ImageView) findViewById(durkhaimR);
        rimagIm2 = (ImageView) findViewById(pareto);
        rimagIm3 = (ImageView) findViewById(kont);
        rimagIm4 = (ImageView) findViewById(tennis);
        rimagIm5 = (ImageView) findViewById(veber);
        rimagIm6 = (ImageView) findViewById(marks);
        rimagIm7 = (ImageView) findViewById(tard);
        rimagIm8 = (ImageView) findViewById(sorokin);
        rimagIm9 = (ImageView) findViewById(spencer);
        rimagIm10 = (ImageView) findViewById(saterlend);
        rimagIm11 = (ImageView) findViewById(merton);
        rimagIm12 = (ImageView) findViewById(mid);*/
        imagIm = (ImageView) findViewById(durkhaim);
        imagIm2 = (ImageView) findViewById(pareto);
        imagIm3 = (ImageView) findViewById(kont);
        imagIm4 = (ImageView) findViewById(mert);
        imagIm5 = (ImageView) findViewById(veber);
        imagIm6 = (ImageView) findViewById(marks);
        imagIm7 = (ImageView) findViewById(tard);
        imagIm8 = (ImageView) findViewById(sorokin);
        imagIm9 = (ImageView) findViewById(spencer);
        imagIm10 = (ImageView) findViewById(saterlend);
        imagIm11 = (ImageView) findViewById(merton);
        imagIm12 = (ImageView) findViewById(mid);
        textins = (TextView) findViewById(R.id.textinside);
        textins2 = (TextView) findViewById(R.id.textinside2);
        textins3 = (TextView) findViewById(R.id.textinside3);
        textins4 = (TextView) findViewById(R.id.textinside4);
       /* ims[2].setOnClickListener(this);
        rimagIm.setOnClickListener(this);
        rimagIm2.setOnClickListener(this);
        rimagIm3.setOnClickListener(this);
        rimagIm4.setOnClickListener(this);
        rimagIm5.setOnClickListener(this);
        rimagIm6.setOnClickListener(this);
        rimagIm7.setOnClickListener(this);
        rimagIm8.setOnClickListener(this);
        rimagIm9.setOnClickListener(this);
        rimagIm10.setOnClickListener(this);
        rimagIm11.setOnClickListener(this);
        rimagIm12.setOnClickListener(this);*/
        imagIm.setOnClickListener(this);
        imagIm2.setOnClickListener(this);
        imagIm3.setOnClickListener(this);
        imagIm4.setOnClickListener(this);
        imagIm5.setOnClickListener(this);
        imagIm6.setOnClickListener(this);
        imagIm7.setOnClickListener(this);
        imagIm8.setOnClickListener(this);
        imagIm9.setOnClickListener(this);
        imagIm10.setOnClickListener(this);
        imagIm11.setOnClickListener(this);
        imagIm12.setOnClickListener(this);
      //  textins.setOnClickListener(this);
        textins2.setOnClickListener(this);
        textins3.setOnClickListener(this);
        textins4.setOnClickListener(this);
    }

    //setting actions on clicking each picture of scientists
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case pareto:
                //dont forget to change background pic
                textins.setVisibility(View.VISIBLE);
                textins.setText(R.string.string_pareto);
                break;
            case kont:
                textins.setVisibility(View.VISIBLE);
                textins.setText(R.string.string_kont);
                break;
            case mert:
                textins2.setVisibility(View.VISIBLE);
                textins2.setText(R.string.string_veber);
                break;
            case veber:
                textins2.setVisibility(View.VISIBLE);
                textins2.setText(R.string.string_veber);
                break;
            case marks:
                textins2.setVisibility(View.VISIBLE);
                textins2.setText(R.string.string_marks);
                break;
            case tard:
                textins3.setVisibility(View.VISIBLE);
                textins3.setText(R.string.string_tard);
                break;
            case sorokin:
                textins3.setVisibility(View.VISIBLE);
                textins3.setText(R.string.string_sorokin);
                break;
            case spencer:
                textins3.setVisibility(View.VISIBLE);
                textins.setText(R.string.string_spencer);
                break;
            case merton:
                textins4.setVisibility(View.VISIBLE);
                textins4.setText(R.string.string_merton);
                break;
            case mid:
                textins4.setVisibility(View.VISIBLE);
                textins4.setText(R.string.string_mid);
                break;
            case saterlend:
                textins4.setVisibility(View.VISIBLE);
                textins4.setText(R.string.string_mid);
                break;

            case textinside:
                if (textins.getVisibility() == View.VISIBLE) {
                    textins.setVisibility(View.INVISIBLE);
                }
                break;

            case textinside2:
                if (textins2.getVisibility() == View.VISIBLE) {
                    textins2.setVisibility(View.INVISIBLE);
                }
                break;
            case textinside3:
                if (textins3.getVisibility() == View.VISIBLE) {
                    textins3.setVisibility(View.INVISIBLE);
                }
                break;
            case textinside4:
                if (textins4.getVisibility() == View.VISIBLE) {
                    textins4.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void handleFirstPersonEvent(View view) {
        textins.setVisibility(View.VISIBLE);
    }
}
