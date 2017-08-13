package com.ram.filesystem1;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ram.filesystem01.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivityTest extends Activity {

    private EditText etFileName;
    private EditText etFileContent;
    private String LOG_TAG = MainActivityTest.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFileName = (EditText) findViewById(R.id.filename_textview);
        etFileContent = (EditText) findViewById(R.id.file_content_textview);
    }

    public void create(View view) {
        String filename = etFileName.getText().toString();
        String fileContent = etFileContent.getText().toString();

        // If necessary, request Runtime Permission
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                this.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 101);
            }
        }

        // Start creating new file
        try {

            File f = new File(this.getExternalFilesDir(null), filename + ".txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);
            String message = fileContent;
            byte[] b = message.getBytes();
            fos.write(b);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void copy(View view) {
        // get name of source file to be copied, from EditText Field.
        String originalFileName = etFileName.getText().toString() + ".txt";

        // Get a java refrence to original source file object
        String myFilePath = this.getExternalFilesDir(null) + "/" + originalFileName;
        File originalFile = new File(myFilePath);

        try {
            FileReader fr = new FileReader(originalFile);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = null;

            // Start reading the source file's text
            line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }

            String originalText = sb.toString();
//            Log.i(LOG_TAG, originalText);


            // Prepare name for duplicate file, e.g abc_copy.text
            String duplicateFileName = etFileName.getText().toString() + "_copy.txt";

            // Create a duplicate File's java Object
            File duplicateFile = new File(this.getExternalFilesDir(null), duplicateFileName);

            if (!duplicateFile.exists()) { // if creating clone file for the first time
                duplicateFile.createNewFile();
            } else { // Blindly return from method, saying: clone file already exists
                Toast.makeText(this, "Duplicate file of " + originalFileName + ", already exists!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Establish a bridge reference via FileWriter
            FileWriter fw = new FileWriter(duplicateFile);
            fw.write(originalText);
            fw.flush();
            fw.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException ie) {

        }


    }

    public void read(View view) {
        // get name of source file to be copied, from EditText Field.
        String originalFileName = etFileName.getText().toString() + ".txt";

        // Get a java refrence to original source file object
        String myFilePath = this.getExternalFilesDir(null) + "/" + originalFileName;
        File originalFile = new File(myFilePath);

        try {
            FileReader fr = new FileReader(originalFile);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = null;

            // Start reading the source file's text
            line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }

            String originalText = sb.toString();
            Log.i(LOG_TAG, originalText);

            showCustomToast(originalText);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom,
                (ViewGroup) findViewById(R.id.custom_toast_container));


        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        TextView tv = (TextView) layout.findViewById(R.id.text);
        tv.setText(message);
        toast.show();
    }

}