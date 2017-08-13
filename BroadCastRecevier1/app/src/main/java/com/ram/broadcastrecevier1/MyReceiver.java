package com.ram.broadcastrecevier1;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    String title;
    String Content;
    int id;

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "power Disconnected", Toast.LENGTH_SHORT).show();
            title="power disconnected";
            Content="phone is charging";
            id=7;
        }else if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)) {
            Toast.makeText(context, "power Connected", Toast.LENGTH_SHORT).show();
            title="power connected";
            Content="phone is not charging";
            id=9;
        }
        makeNotification(context);

    }
    private void makeNotification(Context context){
        Notification.Builder builder=new Notification.Builder(context);
        builder.setContentTitle(title);
        builder.setContentText(Content);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        NotificationManager notificationManager=(NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
       notificationManager.notify(id,builder.build());
    }
}
