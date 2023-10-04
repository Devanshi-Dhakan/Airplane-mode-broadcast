package com.example.prac8cbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirPlaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction()== Intent.ACTION_AIRPLANE_MODE_CHANGED)
        {
            Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_LONG).show();
        }
    }
}
