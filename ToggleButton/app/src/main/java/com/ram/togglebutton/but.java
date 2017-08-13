package com.ram.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;

import static com.ram.togglebutton.R.id.toggleButton2;

public class but extends AppCompatActivity {
    ToggleButton t1,t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        findViewIds();
        b1.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1 : ").append(t1.getText());
                result.append("\nToggleButton2 : ").append(t2.getText());
                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
    public void findViewIds() {
        t1 = (ToggleButton) findViewById(R.id.toggleButton);
        t2 = (ToggleButton) findViewById(R.id.toggleButton2);
        b1 = (Button) findViewById(R.id.button);

    }
}
