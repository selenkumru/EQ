package com.example.eq;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.PasswordAuthentication;


public class NoDogrulama extends AppCompatActivity {

    Button tamam;
    int password = 123; //  burası kod doğrulamaya sistemine göre deüzenlenecek
    TextView hata;
    String şifre_kullanıcı;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_dogrulama);


        tamam = findViewById(R.id.tamam);
        hata = findViewById(R.id.hataMesajı);
        hata.setVisibility(View.GONE); // invisible
        şifre_kullanıcı = findViewById(R.id.Password).toString();


        tamam.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {

if(Integer.toString(password) != şifre_kullanıcı) {
    Intent GirisBasarili_page = new Intent(getApplicationContext(), GirisBasarili.class);
    startActivity(GirisBasarili_page);


}
else if (Integer.toString(password) == şifre_kullanıcı) {
    hata.setVisibility(View.VISIBLE); //visible

}

        }
    });
}
}