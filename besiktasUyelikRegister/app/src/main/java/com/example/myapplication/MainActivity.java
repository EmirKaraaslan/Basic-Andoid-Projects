package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    //XML Objelerinin oluşturulması

    private RadioButton radioButtonE, radioButtonK;
    private Switch switchSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objeleri javaya bağlama

        radioButtonE = (RadioButton) findViewById(R.id.radioButtonErkek);
        radioButtonK=(RadioButton)  findViewById(R.id.radioButtonKadın);

        switchSB = (Switch) findViewById(R.id.switchSiyahBeyaz);


        radioButtonE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    System.out.println("Erkek ");
                }
            }
        });

        radioButtonK.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    System.out.println("Kadın");
                }
            }
        });


        switchSB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    System.out.println("Beyaz");
                }
                else {
                    System.out.println("Siyah");
                }
            }
        });
    }
}