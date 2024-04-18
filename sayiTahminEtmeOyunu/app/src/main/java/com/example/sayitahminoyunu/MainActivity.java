package com.example.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //XMl objelerinin oluşturulması

    private TextView txtKalanHak , txtSonuc ;
    private EditText editTextTahmin;

    private Button butonTahmin;

    private int kalanHak , randomSayi , tahminSayi;
    private String sonuc, tahmin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //objeleri tanımlıyorum

        txtKalanHak = (TextView) findViewById(R.id.textViewKalanHak);
        txtSonuc = (TextView) findViewById(R.id.textViewSonuc);
        editTextTahmin = (EditText) findViewById(R.id.editTextSayiTahmin);
        butonTahmin = (Button) findViewById(R.id.btnTahmin);


        //sistem arka planda random sayı oluşturur




        kalanHak = 3;
        txtKalanHak.setText("Kalan hak : "+String.valueOf(kalanHak));


            butonTahmin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Random random = new Random();
                    randomSayi = random.nextInt(101);

                    tahmin = editTextTahmin.getText().toString();
                    tahminSayi = tahminSayi;
                    if(kalanHak > 0){
                        if(!TextUtils.isEmpty(tahmin)){
                            if(randomSayi == tahminSayi){
                                txtSonuc.setTextColor(Color.GREEN);
                                txtSonuc.setText("Doğru Bildiniz");
                            } else{
                                txtSonuc.setText("Yanlış !!!");
                                kalanHak --;
                                txtKalanHak.setText("Kalan hak : "+String.valueOf(kalanHak));


                            }

                        }
                        else if(TextUtils.isEmpty(tahmin)){
                            txtSonuc.setText("Girdiginiz sayı boş olmaz!!!");
                        }
                    } else{
                        butonTahmin.setEnabled(false);
                        txtSonuc.setText("Haklarınız bitti !");
                    }


                }
            });








    }
}