package com.ram.practicefile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    private EditText etFileName;
    private EditText etFileContent;
    private String LOG_TAG = MainActivity.class.getSimpleName();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFileName = (EditText) findViewById(R.id.filename_et);
        etFileContent = (EditText) findViewById(R.id.filecontent_et);
    }

    public void create(View view) {
        String filename = etFileName.getText().toString();
        String filecontent = etFileContent.getText().toString();
        try {
            File f = new File(this.getExternalFilesDir(null), filename + ".txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(f);
            String message = filecontent;
            byte[] b = message.getBytes();
            fos.write(b);
            fos.flush();
            fos.close();
            showCustomToast("File Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showCustomToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom));

        TextView text = (TextView) layout.findViewById(R.id.toast_tv);
        text.setText(message);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}