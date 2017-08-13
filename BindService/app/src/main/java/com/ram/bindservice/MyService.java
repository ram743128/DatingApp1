package com.ram.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyService";
    IBinder mIBinder=new LocalBinder();//created IBinder object so that interact with main activity.

    public MyService() {
    }

    public double getSQRT(double d) {
        return Math.sqrt(d);
    }

    class LocalBinder extends Binder{
        public MyService getMyService(){
            return MyService.this;
        }

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: ");
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind: ");
        return mIBinder;
        // TODO: Return the communication channel to the service.
       // throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(TAG, "onUnbind: ");
        return true;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }


}
