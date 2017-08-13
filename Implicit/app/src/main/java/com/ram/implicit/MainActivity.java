package com.ram.implicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button butt;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        butt=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.edit);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/activities/activity-lifecycle.html"));
               // startActivity(i);
               /* String s=ed1.getText().toString();
         if(s.startsWith("https://")) {
             Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
             startActivity(i);
         }
         else
         {
             Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+s));
             startActivity(j);
         }*/
               Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

            }

        });
    }
}

