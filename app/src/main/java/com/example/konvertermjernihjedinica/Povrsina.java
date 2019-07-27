package com.example.konvertermjernihjedinica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Povrsina extends AppCompatActivity {

    Spinner Spinner1,Spinner2;
    Button pretvoriBtn;
    TextView resultTextView;
    EditText firstNumEditText;
    double privremeniRezultat;
    double result;
    double num1;
    int mPosition, mPosition2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povrsina);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        //num1 = Double.parseDouble(firstNumEditText.getText().toString());
        Spinner1 = findViewById(R.id.Spinner1);
        Spinner2 = findViewById(R.id.Spinner2);
        pretvoriBtn = (Button) findViewById(R.id.pretvoriBtn);
        pretvoriBtn.setEnabled(false);



        final String povrsina[] = {"Metar kvadratni", "Acre", "Ar", "Centimetar kvadratni", "Hektar", "Jard kvadratni", "Kilometar kvadratni", "Jutro povšine", "Milja kvadratna", "Inch kvadratni", "Stopa kvadratna" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, povrsina);
        Spinner1.setAdapter(adapter);

        Spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String odaberiJedinicu = povrsina[position];
                Toast.makeText(Povrsina.this, "Odabrana mjerna jedinica: " + odaberiJedinicu, Toast.LENGTH_SHORT).show();
                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Povrsina.this, android.R.layout.simple_spinner_dropdown_item, povrsina);
                Spinner2.setAdapter(adapter2);


                mPosition = position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Povrsina.this, android.R.layout.simple_spinner_dropdown_item, povrsina);
        Spinner2.setAdapter(adapter2);
        Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {

                String odaberiJedinicu = povrsina[position2];
                Toast.makeText(Povrsina.this, "Odabrana mjerna jedinica: " + odaberiJedinicu, Toast.LENGTH_SHORT).show();


                mPosition2 = position2;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        firstNumEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals(""))
                {
                    pretvoriBtn.setEnabled(false);
                }
                else
                {
                    pretvoriBtn.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        pretvoriBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Double.parseDouble(firstNumEditText.getText().toString());
                switch(mPosition)
                {
                    case 0:
                        privremeniRezultat = num1;
                        break;
                    case 1:
                        privremeniRezultat = num1 * 4046.8564224;
                        break;
                    case 2:
                        privremeniRezultat = num1 * 100;
                        break;
                    case 3:
                        privremeniRezultat = num1 * 0.0001;
                        break;
                    case 4:
                        privremeniRezultat = num1 * 10000;
                        break;
                    case 5:
                        privremeniRezultat = num1 * 0.836127;
                        break;
                    case 6:
                        privremeniRezultat = num1 * 1000000;
                        break;
                    case 7:
                        privremeniRezultat = num1 * 5754.64;
                        break;
                    case 8:
                        privremeniRezultat = num1 * 2589988.110336;
                        break;
                    case 9:
                        privremeniRezultat = num1 * 0.000645;
                        break;
                    case 10:
                        privremeniRezultat = num1 * 0.092903;
                        break;
                }

                switch(mPosition2)
                {
                    case 0:
                        result = privremeniRezultat;
                        break;
                    case 1:
                        result = privremeniRezultat / 4046.8564224;
                        break;
                    case 2:
                        result = privremeniRezultat / 100;
                        break;
                    case 3:
                        result = privremeniRezultat / 0.0001;
                        break;
                    case 4:
                        result = privremeniRezultat / 10000;
                        break;
                    case 5:
                        result = privremeniRezultat / 0.836127;
                        break;
                    case 6:
                        result = privremeniRezultat / 1000000;
                        break;
                    case 7:
                        result = privremeniRezultat / 5754.64;
                        break;
                    case 8:
                        result = privremeniRezultat / 2589988.110336;
                        break;
                    case 9:
                        result = privremeniRezultat / 0.000645;
                        break;
                    case 10:
                        result = privremeniRezultat / 0.092903;
                        break;
                }

                resultTextView.setText(result + "");
            }
        });

    }
}
