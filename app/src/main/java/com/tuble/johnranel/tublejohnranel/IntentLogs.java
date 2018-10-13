package com.tuble.johnranel.tublejohnranel;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class IntentLogs extends IntentService{
    public IntentLogs() {
        super ("com.tuble.johnranel.tublejohnranel.IntentLogs");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("4ITI", "Service is running");
    }
}
