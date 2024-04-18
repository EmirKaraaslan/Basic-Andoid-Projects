package com.example.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //XML deki nesneler

    private EditText  editTextBirinciSayi , editTextiIkinciSayi;

    private Button toplamaButonu , cikartmaButonu , carpmaButonu , bolmeButonu;

    private TextView txtViewSonuc;

    private  String birinciSayi , ikinciSayi;
    private  int s1 , s2 , sonuc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toplamaButonu = (Button) findViewById(R.id.butonToplama);
        cikartmaButonu = (Button) findViewById(R.id.butonCikartma);
        carpmaButonu = (Button) findViewById(R.id.butonCarpma);
        bolmeButonu = (Button) findViewById(R.id.butonBolme);

        editTextBirinciSayi = (EditText) findViewById(R.id.editTextNumber1);
        editTextiIkinciSayi = (EditText) findViewById(R.id.editTextNumber2);

        txtViewSonuc = (TextView) findViewById(R.id.textViewSonuc);


        toplamaButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birinciSayi = editTextBirinciSayi.getText().toString();
                ikinciSayi = editTextiIkinciSayi.getText().toString();

                s1  = Integer.valueOf(birinciSayi);
                s2 = Integer.valueOf(ikinciSayi);

                sonuc = s1+s2;

                txtViewSonuc.setText(String.valueOf(sonuc));
            }
        });


        cikartmaButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birinciSayi = editTextBirinciSayi.getText().toString();
                ikinciSayi = editTextiIkinciSayi.getText().toString();

                s1  = Integer.valueOf(birinciSayi);
                s2 = Integer.valueOf(ikinciSayi);

                sonuc = s1-s2;

                txtViewSonuc.setText(String.valueOf(sonuc));
            }
        });



        carpmaButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birinciSayi = editTextBirinciSayi.getText().toString();
                ikinciSayi = editTextiIkinciSayi.getText().toString();

                s1  = Integer.valueOf(birinciSayi);
                s2 = Integer.valueOf(ikinciSayi);

                sonuc = s1*s2;

                txtViewSonuc.setText(String.valueOf(sonuc));
            }
        });


        bolmeButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birinciSayi = editTextBirinciSayi.getText().toString();
                ikinciSayi = editTextiIkinciSayi.getText().toString();

                s1  = Integer.valueOf(birinciSayi);
                s2 = Integer.valueOf(ikinciSayi);

                sonuc = s1/s2;

                txtViewSonuc.setText(String.valueOf(sonuc));
            }
        });








    }







/*
    public void btnClick(View v){

        birinciSayi = editTextBirinciSayi.getText().toString();
        ikinciSayi = editTextiIkinciSayi.getText().toString();

        if(!TextUtils.isEmpty(editTextBirinciSayi.getText())&& !TextUtils.isEmpty(editTextiIkinciSayi.getText())){

            s1 = Integer.valueOf(birinciSayi);
            s2 = Integer.valueOf(ikinciSayi);
            hesapla = new hesapla(s1,s2);

            switch (v.getId()){

                case R.id.butonToplama:
                    sonuc= hesapla.toplama();
                    break;



            }

            }



        }

  */
}


