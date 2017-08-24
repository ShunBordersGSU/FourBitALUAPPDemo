package com.example.shunborders.fourbitaluapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean aa0, aa1, aa2, aa3, bb0, bb1, bb2, bb3, operand;
    RadioButton a0, a1, a2, a3, b0, b1, b2, b3;
    Button clear, add, sub;
    TextView s0, s1, s2, s3, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = (Button) findViewById(R.id.clear);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);


        a0=(RadioButton)findViewById(R.id.a0);
        a1=(RadioButton)findViewById(R.id.a1);
        a2=(RadioButton)findViewById(R.id.a2);
        a3=(RadioButton)findViewById(R.id.a3);

        aa0=false;
        aa1=false;
        aa2=false;
        aa3=false;

        b0=(RadioButton)findViewById(R.id.b0);
        b1=(RadioButton)findViewById(R.id.b1);
        b2=(RadioButton)findViewById(R.id.b2);
        b3=(RadioButton)findViewById(R.id.b3);

        bb0=false;
        bb1=false;
        bb2=false;
        bb3=false;

        final TextView s0 = (TextView) findViewById(R.id.s0);
        final TextView s1 = (TextView) findViewById(R.id.s1);
        final TextView s2 = (TextView) findViewById(R.id.s2);
        final TextView s3 = (TextView) findViewById(R.id.s3);

        final TextView c = (TextView) findViewById(R.id.c);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (a0.isChecked()){
                    aa0=true;
                }

                if (a1.isChecked()){
                    aa1=true;
                }

                if (a2.isChecked()){
                    aa2=true;
                }

                if (a3.isChecked()){
                    aa3=true;
                }

                if (b0.isChecked()){
                    bb0=true;
                }

                if (b1.isChecked()){
                    bb1=true;
                }

                if (b2.isChecked()){
                    bb2=true;
                }

                if (b3.isChecked()){
                    bb3=true;
                }

                sub.setClickable(false);
                add.setClickable(false);

                FourBitALU fba = new FourBitALU();
                fba.setA(aa0, aa1, aa2, aa3);
                fba.setB(bb0, bb1, bb2, bb3);
                operand = false;
                fba.execute(operand);
                s0.setText("S0="+fba.getS0());
                s1.setText("S1="+fba.getS1());
                s2.setText("S2="+fba.getS2());
                s3.setText("S3="+fba.getS3());

                c.setText("C="+fba.getC());
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (a0.isChecked()){
                    aa0=true;
                }

                if (a1.isChecked()){
                    aa1=true;
                }

                if (a2.isChecked()){
                    aa2=true;
                }

                if (a3.isChecked()){
                    aa3=true;
                }

                if (b0.isChecked()){
                    bb0=true;
                }

                if (b1.isChecked()){
                    bb1=true;
                }

                if (b2.isChecked()){
                    bb2=true;
                }

                if (b3.isChecked()){
                    bb3=true;
                }

                add.setClickable(false);
                sub.setClickable(false);

                FourBitALU fba = new FourBitALU();
                fba.setA(aa0, aa1, aa2, aa3);
                fba.setB(bb0, bb1, bb2, bb3);
                operand = true;
                fba.execute(operand);
                s0.setText("S0="+fba.getS0());
                s1.setText("S1="+fba.getS1());
                s2.setText("S2="+fba.getS2());
                s3.setText("S3="+fba.getS3());

                c.setText("C="+fba.getC());
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                    a0.setChecked(false);


                    a1.setChecked(false);


                    a2.setChecked(false);


                    a3.setChecked(false);


                    b0.setChecked(false);


                    b1.setChecked(false);


                    b2.setChecked(false);


                   b3.setChecked(false);


                sub.setClickable(true);
                add.setClickable(true);
                FourBitALU fba = new FourBitALU();

                operand = false;
                aa0=false;
                aa1=false;
                aa2=false;
                aa3=false;

                bb0=false;
                bb1=false;
                bb2=false;
                bb3=false;


                fba.setA(aa0, aa1, aa2, aa3);
                fba.setB(bb0, bb1, bb2, bb3);


                s0.setText("S0=");
                s1.setText("S1=");
                s2.setText("S2=");
                s3.setText("S3=");

                c.setText("C=");
            }
        });
    }
}
