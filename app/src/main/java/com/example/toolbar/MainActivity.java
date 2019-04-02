package com.example.toolbar;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Button b, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);

        android.support.v7.widget.Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }
    public void toolbarVisibility(View v){
        if(v.getId() == R.id.button2){
            android.support.v7.app.ActionBar actionBar = getSupportActionBar();
            actionBar.hide();
        } else if (v.getId() == R.id.button3){
            android.support.v7.app.ActionBar actionBar = getSupportActionBar();
            actionBar.show();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_favorite:
                Toast.makeText(getApplicationContext(), "You clicked Favourite",
                                                           Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_backup:
                Toast.makeText(getApplicationContext(), "You clicked Backup",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "You clicked Settings",
                                                          Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_copy:
                Toast.makeText(getApplicationContext(), "You clicked Copy",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
