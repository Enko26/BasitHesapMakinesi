package com.example.hesapmakine;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText s1 , s2;
    MaterialButton topla ,carp ,bol ,cikar,esit;
    TextView sonucu;
    double sonucsayi = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        actionBar.hide();
        // for text views
        s1 = findViewById(R.id.Sayi1);
        s2 = findViewById(R.id.Sayi2);

        // for button with operations
        topla = findViewById(R.id.toplama);
        carp = findViewById(R.id.carpma);
        bol = findViewById(R.id.bolme);
        cikar = findViewById(R.id.cikarma);

        // for equal to button
        esit = findViewById(R.id.esittir);

        // for answer field
        sonucu = findViewById(R.id.sonuc);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayiBir = s1.getText().toString();
                String Sayiİki = s2.getText().toString();

                if (sayiBir.isEmpty() || Sayiİki.isEmpty()) {
                    //uyarı mesajı
                    Toast.makeText(getApplicationContext(),"Numara Giriniz",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(s1.getText().toString());
                    double b = Double.parseDouble(s2.getText().toString());
                    sonucsayi = a + b;
                }
            }
        });

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayiBir = s1.getText().toString();
                String Sayiİki = s2.getText().toString();

                if (sayiBir.isEmpty() || Sayiİki.isEmpty()) {
                    //bilgilendirme mesajı
                    Toast.makeText(getApplicationContext(),"Numara Giriniz",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(s1.getText().toString());
                    double b = Double.parseDouble(s2.getText().toString());
                    sonucsayi = a - b;
                }
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayiBir = s1.getText().toString();
                String Sayiİki = s2.getText().toString();

                if (sayiBir.isEmpty() || Sayiİki.isEmpty()) {
                    //bilgilendirme mesajı
                   Toast.makeText(getApplicationContext(),"Numara Giriniz",Toast.LENGTH_SHORT).show();

                }
                else {
                    double a = Double.parseDouble(s1.getText().toString());
                    double b = Double.parseDouble(s2.getText().toString());
                    sonucsayi = a * b;
                }
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayiBir = s1.getText().toString();
                String Sayiİki = s2.getText().toString();

                if (sayiBir.isEmpty() || Sayiİki.isEmpty()) {
                    //bilgilendirme mesajı
                    Toast.makeText(getApplicationContext(), "Numara Giriniz", Toast.LENGTH_SHORT).show();
                } else {
                    double a = Double.parseDouble(s1.getText().toString());
                    double b = Double.parseDouble(s2.getText().toString());
                    if (b != 0)
                        sonucsayi = a / b;
                    else
                        Toast.makeText(getApplicationContext(), "Yeni bir numara giriniz", Toast.LENGTH_SHORT).show();
                }
            }
        });

        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sonucumuz = String.valueOf(sonucsayi);
                sonucu.setText(sonucumuz);
                sonucsayi= 0;
            }
        });

    }
}

