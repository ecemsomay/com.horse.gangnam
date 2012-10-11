package com.horse.geoloc.mapview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       
        
        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Wilkommen", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "nagihan", Toast.LENGTH_SHORT).show();
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
}
