package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class haxToDec extends AppCompatActivity {

    TextView deciaml;
    TextView binary;
    TextView octal;
    EditText editText;
    Button reset;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hax_to_dec);

        deciaml = (TextView)findViewById(R.id.decimal);
        binary =(TextView)findViewById(R.id.binary);
        octal= (TextView)findViewById(R.id.Octal);
        editText = (EditText)findViewById(R.id.hax_number_edit);
        reset = (Button)findViewById(R.id.reset_button);
        convert =(Button)findViewById(R.id.convert_button);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                deciaml.setText("");
                binary.setText("");
                octal.setText("");
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number  = editText.getText().toString();
                int decimalResult = Integer.parseInt(number,16);
                deciaml.setText(""+decimalResult);
                String binaryResult = Integer.toBinaryString(decimalResult);
                binary.setText(binaryResult);
                String octalResult = Integer.toOctalString(decimalResult);
                octal.setText(octalResult);

            }
        });

    }


}

