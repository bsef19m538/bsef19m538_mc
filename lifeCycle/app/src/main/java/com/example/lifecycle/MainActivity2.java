package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String q = intent.getStringExtra("a");
        textView.setText(q);
        Log.d("life Cycle","OnCreate the Main Activity2");
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("Life Activity","onStart the  main Activity2");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("Life Activity","onResume the  main Activity2");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("Life Activity","onPause the  main activity2");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("Life Activity","onStop the  main activity2");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Life Activity","onDestroy the  main activity2");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Life Activity","onRestart the  main activity2");
    }
}