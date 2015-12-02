package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"oncreate",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart(){
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
        super.onStart();
    }
    @Override
    protected void onResume(){
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
        super.onResume();
    }
    @Override
    protected void onPause(){
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
        super.onPause();
        Intent intent = new Intent(MainActivity.this,testActivity.class);
        startActivity(intent);

    }
    @Override
    protected void onStop(){
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}