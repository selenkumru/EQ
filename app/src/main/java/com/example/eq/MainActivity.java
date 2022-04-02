package com.example.eq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    Button Kaydol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //s
        InitializationComponents();
        Kaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Kaydol_page = new Intent(getApplicationContext(), Kaydol.class);
                startActivity(Kaydol_page);
            }
        });


        mDatabase = FirebaseDatabase.getInstance().getReference("message");

        mDatabase.setValue("Hello, World!");
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buton();
            }
        });
    }

    public void buton(){

       TextView text = (TextView)findViewById(R.id.textView);
        String a = text.getText().toString();

        User user = new User(a, "dasfsadfsa@gmaail.com");

        mDatabase.child("users").child("userId").child("username").setValue(user.username);


    }
//s
public void InitializationComponents() {

    Kaydol = findViewById(R.id.buttonKaydol);

}

}