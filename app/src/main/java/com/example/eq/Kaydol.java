package com.example.eq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kaydol extends AppCompatActivity {
    Button buttonK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaydol);


        buttonK = findViewById(R.id.buttonK);

        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dogrulama_page = new Intent(getApplicationContext(), NoDogrulama.class);
                startActivity(Dogrulama_page);
            }
        });


    }
}