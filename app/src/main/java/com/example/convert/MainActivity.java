package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button decToBinHaxOct;
    private Button BinToDec;
    private Button HaxToDec;
    private Button OctToDec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decToBinHaxOct = findViewById(R.id.decToBinHaxOct_button);
        BinToDec = findViewById(R.id.binToDec_button);
        HaxToDec = findViewById(R.id.HaxToDec_button);
        OctToDec = findViewById(R.id.OctToDec_button);



        decToBinHaxOct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDecToBinHaxOct();
            }
        });

        BinToDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBinToDec();
            }
        });
        HaxToDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHaxToDec();
            }
        });
        OctToDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityOctToDec();
            }
        });




    }
    public void openActivityDecToBinHaxOct(){
        Intent intent= new Intent(this,decimalToBinary.class);
        startActivity(intent);
    }
    public void openActivityBinToDec(){
        Intent intent= new Intent(this,binaryToDecimal.class);
        startActivity(intent);
    }
    public void openActivityHaxToDec(){
        Intent intent= new Intent(this,haxToDec.class);
        startActivity(intent);
    }
    public void openActivityOctToDec(){
        Intent intent= new Intent(this,octToDec.class);
        startActivity(intent);
    }

}