package com.ram.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2,b3,b4;
    TextView p;
    Double d1,d2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.edit1);
        t2=(EditText)findViewById(R.id.edit2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        p=(TextView)findViewById(R.id.text1);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String num1 = t1.getText().toString();
                                      String num2 = t2.getText().toString();
                                      d1 = Double.parseDouble(num1);
                                      d2 = Double.parseDouble(num2);

                                      result = d1 + d2;
                                      p.setText("Result:" + result);


                                  }
                              });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String num1 = t1.getText().toString();
                        String num2 = t2.getText().toString();
                        d1 = Double.parseDouble(num1);
                        d2 = Double.parseDouble(num2);

                        result = d1 - d2;
                        p.setText("Result:" + result);
                    }



    });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                d1 = Double.parseDouble(num1);
                d2 = Double.parseDouble(num2);

                result = d1*d2;
                p.setText("Result:" + result);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                d1 = Double.parseDouble(num1);
                d2 = Double.parseDouble(num2);

                result = d1%d2;
                p.setText("Result:" + result);


            }
        });

}
}
