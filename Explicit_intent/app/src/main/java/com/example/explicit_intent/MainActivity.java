package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

Button b;
b = findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =Uri.parse("tel:+923316877596");
                Intent i =  new Intent(Intent.ACTION_DIAL,uri);

                startActivity(i);
            }
        });
    }



}