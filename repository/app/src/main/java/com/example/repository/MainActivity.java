package com.example.repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
                Uri uri =Uri.parse("https://github.com/bsef19m538/bsef19m538_mc.git");
                Intent i =  new Intent(Intent.ACTION_VIEW,uri);

                startActivity(i);
            }
        });

    }


}