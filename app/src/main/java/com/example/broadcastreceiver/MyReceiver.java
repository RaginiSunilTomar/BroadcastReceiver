package com.example.broadcastreceiver;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        TelephonyManager tm = (TelephonyManager) context.getSystemService(Service.TELEPHONY_SERVICE);
         int state = tm.getCallState();

         if (state == TelephonyManager.CALL_STATE_OFFHOOK)
         {
             Toast.makeText(context, "Active ", Toast.LENGTH_SHORT).show();
         }

        if (state == TelephonyManager.CALL_STATE_IDLE)
        {
            Toast.makeText(context, "Idle", Toast.LENGTH_SHORT).show();
        }

        if (state == TelephonyManager.CALL_STATE_RINGING)
        {
            Toast.makeText(context, "Ringing", Toast.LENGTH_SHORT).show();
        }

    }
}
