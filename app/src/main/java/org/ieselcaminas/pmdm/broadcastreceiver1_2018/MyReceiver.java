package org.ieselcaminas.pmdm.broadcastreceiver1_2018;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Locale changed", Toast.LENGTH_LONG).show();
        Log.d("1234", "Locale changed");
    }
}
