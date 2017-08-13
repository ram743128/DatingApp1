package com.ram.filesystem;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    public void createFile() {
        try{
            File f=new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"helo.txt");
            if(!f.exists())
            {
                f.createNewFile();
            }
            FileOutputStream fos=new FileOutputStream(f);
            String message="Hello Friends ";
            byte[] b=message.getBytes();
            fos.write(b);
            fos.flush();
            fos.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
