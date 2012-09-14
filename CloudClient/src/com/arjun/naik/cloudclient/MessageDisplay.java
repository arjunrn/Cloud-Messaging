package com.arjun.naik.cloudclient;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MessageDisplay extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_display);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_message_display, menu);
        return true;
    }
}
