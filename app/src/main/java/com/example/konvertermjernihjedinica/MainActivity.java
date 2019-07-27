package com.example.konvertermjernihjedinica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button duljinaBtn = (Button) findViewById(R.id.duljinaBtn);
        duljinaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuljina();
            }
        });
        Button masaBtn = (Button) findViewById(R.id.masaBtn);
        masaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMasa();
            }
        });
        Button povrsinaBtn = (Button) findViewById(R.id.povrsinaBtn);
        povrsinaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPovrsina();
            }
        });
        Button temperaturaBtn = (Button) findViewById(R.id.temperaturaBtn);
        temperaturaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTemperatura();
            }
        });
        Button volumenBtn = (Button) findViewById(R.id.volumenBtn);
        volumenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVolumen();
            }
        });
        Button dataBtn = (Button) findViewById(R.id.dataBtn);
        dataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openData();
            }
        });
        Button brzinaBtn = (Button) findViewById(R.id.brzinaBtn);
        brzinaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrzina();
            }
        });
        Button frekvencijaBtn = (Button) findViewById(R.id.frekvencijaBtn);
        frekvencijaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFrekvencija();
            }
        });
        Button energijaBtn = (Button) findViewById(R.id.energijaBtn);
        energijaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnergija();
            }
        });
        Button gorivoBtn = (Button) findViewById(R.id.gorivoBtn);
        gorivoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGorivo();
            }
        });
        Button tlakBtn = (Button) findViewById(R.id.tlakBtn);
        tlakBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTlak();
            }
        });
        Button kutBtn = (Button) findViewById(R.id.kutBtn);
        kutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKut();
            }
        });
        Button oAutoruBtn = (Button) findViewById(R.id.oAutoruBtn);
        oAutoruBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOAutoru();
            }
        });
    }
    public void openDuljina()
    {
        Intent intent = new Intent(this, Duljina.class);
        startActivity(intent);
    }
    public void openMasa()
    {
        Intent intent = new Intent(this, Masa.class);
        startActivity(intent);
    }
    public void openPovrsina()
    {
        Intent intent = new Intent(this, Povrsina.class);
        startActivity(intent);
    }
    public void openTemperatura()
    {
        Intent intent = new Intent(this, Temperatura.class);
        startActivity(intent);
    }
    public void openVolumen()
    {
        Intent intent = new Intent(this, Volumen.class);
        startActivity(intent);
    }
    public void openData()
    {
        Intent intent = new Intent(this, Data.class);
        startActivity(intent);
    }
    public void openBrzina()
    {
        Intent intent = new Intent(this, Brzina.class);
        startActivity(intent);
    }
    public void openFrekvencija()
    {
        Intent intent = new Intent(this, Frekvencija.class);
        startActivity(intent);
    }
    public void openEnergija()
    {
        Intent intent = new Intent(this, Energija.class);
        startActivity(intent);
    }
    public void openGorivo()
    {
        Intent intent = new Intent(this, Gorivo.class);
        startActivity(intent);
    }
    public void openTlak()
    {
        Intent intent = new Intent(this, Tlak.class);
        startActivity(intent);
    }
    public void openKut()
    {
        Intent intent = new Intent(this, Kut.class);
        startActivity(intent);
    }
    public void openOAutoru()
    {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

}
