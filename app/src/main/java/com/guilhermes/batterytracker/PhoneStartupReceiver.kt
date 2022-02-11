package com.guilhermes.batterytracker

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class PhoneStartupReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Toast.makeText(context, "PHONE STARTED", Toast.LENGTH_LONG).show()
        }
    }
}