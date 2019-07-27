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

public class Data extends AppCompatActivity {

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
        setContentView(R.layout.activity_data);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        //num1 = Double.parseDouble(firstNumEditText.getText().toString());
        Spinner1 = findViewById(R.id.Spinner1);
        Spinner2 = findViewById(R.id.Spinner2);
        pretvoriBtn = (Button) findViewById(R.id.pretvoriBtn);
        pretvoriBtn.setEnabled(false);



        final String data[] = {"Bit","Kilobit", "Megabit", "Gigabit", "Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte", "Petabyte", "Exabyte", "Zetabyte", "Jotabyte"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, data);
        Spinner1.setAdapter(adapter);

        Spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String odaberiJedinicu = data[position];
                Toast.makeText(Data.this, "Odabrana mjerna jedinica: " + odaberiJedinicu, Toast.LENGTH_SHORT).show();
                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Data.this, android.R.layout.simple_spinner_dropdown_item, data);
                Spinner2.setAdapter(adapter2);


                mPosition = position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Data.this, android.R.layout.simple_spinner_dropdown_item, data);
        Spinner2.setAdapter(adapter2);
        Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {

                String odaberiJedinicu = data[position2];
                Toast.makeText(Data.this, "Odabrana mjerna jedinica: " + odaberiJedinicu, Toast.LENGTH_SHORT).show();


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
                        privremeniRezultat = num1 / 8;
                        break;
                    case 1:
                        privremeniRezultat = num1 * 125;
                        break;
                    case 2:
                        privremeniRezultat = num1 * 125000;
                        break;
                    case 3:
                        privremeniRezultat = num1 * 1250 * 100000;
                        break;
                    case 4:
                        privremeniRezultat = num1;
                        break;
                    case 5:
                        privremeniRezultat = num1 * 1000;
                        break;
                    case 6:
                        privremeniRezultat = num1 * 1000000;
                        break;
                    case 7:
                        privremeniRezultat = num1 * 1000000000;
                        break;
                    case 8:
                        privremeniRezultat = num1 * 1000000 * 1000000;
                        break;
                    case 9:
                        privremeniRezultat = num1 * 1000000000 * 1000000;
                        break;
                    case 10:
                        privremeniRezultat = num1 * 1000000000 * 1000000000;
                        break;
                    case 11:
                        privremeniRezultat = num1 * 1000000000 * 1000000000 * 1000000;
                        break;
                }

                switch(mPosition2)
                {
                    case 0:
                        result = privremeniRezultat * 8;
                        break;
                    case 1:
                        result = privremeniRezultat / 125;
                        break;
                    case 2:
                        result = privremeniRezultat / 125000;
                        break;
                    case 3:
                        result = privremeniRezultat / 1250 / 100000;
                        break;
                    case 4:
                        result = privremeniRezultat;
                        break;
                    case 5:
                        result = privremeniRezultat / 1000;
                        break;
                    case 6:
                        result = privremeniRezultat / 1000000;
                        break;
                    case 7:
                        result = privremeniRezultat / 1000000000;
                        break;
                    case 8:
                        result = privremeniRezultat / 1000000 / 1000000;
                        break;
                    case 9:
                        result = privremeniRezultat / 1000000000 / 1000000;
                        break;
                    case 10:
                        result = privremeniRezultat / 1000000000 / 1000000000;
                        break;
                    case 11:
                        result = privremeniRezultat / 1000000000 / 1000000000 / 1000000;
                        break;
                }

                resultTextView.setText(result + "");
            }
        });
    }
}
