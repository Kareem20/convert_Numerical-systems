package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class octToDec extends AppCompatActivity {

    TextView decimal;
    TextView binary;
    TextView hax;
    EditText editText;
    Button reset;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oct_to_dec);

        decimal = (TextView)findViewById(R.id.decimal3);
        binary =(TextView)findViewById(R.id.binary3);
        hax= (TextView)findViewById(R.id.Hax3);
        editText = (EditText)findViewById(R.id.octal_number_edit);
        reset = (Button)findViewById(R.id.reset3_button);
        convert =(Button)findViewById(R.id.convert3_button);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                decimal.setText("");
                binary.setText("");
                hax.setText("");
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                int decimalResult = Integer.parseInt(number,8);
                decimal.setText(""+decimalResult);
                String binaryResult = Integer.toBinaryString(decimalResult);
                binary.setText(binaryResult);
                String haxResult = Integer.toHexString(decimalResult);
                hax.setText(haxResult);

            }
        });
    }
}
