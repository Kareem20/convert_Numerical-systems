package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class decimalToBinary extends AppCompatActivity {
    private EditText editText;
    private Button convert;
    private Button reset;
    private TextView binaryNum;
    private TextView hexNum;
    private TextView octNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_binary);

        editText = findViewById(R.id.decimal_number_edit);
        convert = findViewById(R.id.convert_button);
        reset =findViewById(R.id.reset_button);
        binaryNum = findViewById(R.id.binary);
        hexNum = findViewById(R.id.hex);
        octNum = findViewById(R.id.Octal);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                int num = Integer.parseInt(number);
                String binary = Integer.toBinaryString(num);
                binaryNum.setText(binary);
                String hex = Integer.toHexString(num);
                hexNum.setText(hex);
                String oct = Integer.toOctalString(num);
                octNum.setText(oct);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                binaryNum.setText("");
                hexNum.setText("");
                octNum.setText("");
            }
        });

    }
}
