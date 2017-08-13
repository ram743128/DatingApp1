package com.example.ram.first;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   TextView  text;
    Button butt;
    ImageButton i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.print);
        text= (TextView)findViewById(R.id.hello);
        butt= (Button) findViewById(R.id.click);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextSize(80);

            }
        });

    }
}
