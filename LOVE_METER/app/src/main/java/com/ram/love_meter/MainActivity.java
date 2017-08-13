package com.ram.love_meter;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.edit1);
        ed2=(EditText)findViewById(R.id.edit2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int y=0;
                int b=0;

                String s=ed1.getText().toString();
                for(int i=0;i<s.length();i++)
                {
                    int x=s.charAt(i);
                    y=y+x;
                }

                String s1=ed2.getText().toString();
                for(int i=0;i<s1.length();i++)
                {
                    int a=s1.charAt(i);
                    b=b+a;
                }
                int d=((y+b)/s.length())/5;
                Intent i= new Intent(MainActivity.this,Main3Activity.class);
                i.putExtra("RESULT:",""+ d);
                startActivity(i);
            }
        });
    }
}
