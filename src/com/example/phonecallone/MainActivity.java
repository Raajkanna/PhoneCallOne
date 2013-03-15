package com.example.phonecallone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void call() {
        try {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:14256230815"));
            startActivity(callIntent);
        } catch (ActivityNotFoundException activityException) {
             System.out.println("helloandroid dialing example - Call failed");
        }
    }
    
}
