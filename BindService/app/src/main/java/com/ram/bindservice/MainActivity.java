package com.ram.bindservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ServiceConnection mServiceConnection;
    public MyService mMyService;
    private boolean isServiceConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mServiceConnection= new ServiceConnection() {

            @Override
            public void onServiceConnected(ComponentName name, IBinder iBinder) {
                MyService.LocalBinder mLocalBinder=(MyService.LocalBinder)iBinder;//iBinder object fetches data from serviesces to main activit,ibinder object is created in myservice .java
              mMyService=mLocalBinder.getMyService();//get service from local binder
               isServiceConnected=true;
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {


            }
        };
    }

    public void createService(View view) {
        if (isServiceConnected) {
            Toast.makeText(this, "service already exist", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, MyService.class);
            bindService(intent, mServiceConnection, BIND_AUTO_CREATE);//new service created and bind.
        }
    }

    public void destroyService(View view) {
        if(isServiceConnected){
            unbindService(mServiceConnection);
            isServiceConnected=false;

        }else {
            Toast.makeText(mMyService, "service is already connected", Toast.LENGTH_SHORT).show();
        }
    }

    public void getResult(View view) {
        if(isServiceConnected){
            double result=mMyService.getSQRT(80);
            Toast.makeText(MainActivity.this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "service is not connected", Toast.LENGTH_SHORT).show();
        }
    }
}
