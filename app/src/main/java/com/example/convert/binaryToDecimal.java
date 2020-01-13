package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class binaryToDecimal extends AppCompatActivity {

    private TextView decimal;
    private TextView hax;
    private TextView octal;
    private EditText editText;
    private Button convert;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_to_decimal);

        editText = findViewById(R.id.binary_number_edit);
        convert = findViewById(R.id.convert2_button);
        reset = findViewById(R.id.reset2_button);
        decimal = findViewById(R.id.decimal2);
        hax = findViewById(R.id.Hax2);
        octal = findViewById(R.id.Octal2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                int numberInteger = Integer.parseInt(number);
                int deciaml = Integer.parseInt(number, 2);
                decimal.setText("" + deciaml);
                String haxre = Integer.toString(deciaml, 16);
                hax.setText("" + haxre);
                String octre = Integer.toString(deciaml, 8);
                octal.setText("" + octre);


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                decimal.setText("");
                hax.setText("");
                octal.setText("");
            }
        });


    }
}
