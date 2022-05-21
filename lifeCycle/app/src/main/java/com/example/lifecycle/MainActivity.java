package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b;
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                String z = "this the life cycle of activity";
                intent.putExtra("a",z);
                startActivity(intent);

            }
        });

        Log.d("life Cycle","OnCreate the Main Activity");
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("Life Activity","onStart the  main activity");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("Life Activity","onResume the  main activity");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("Life Activity","onPause the  main activity");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("Life Activity","onStop the  main activity");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Life Activity","onDestroy the  main activity");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Life Activity","onRestart the  main activity");
    }
}