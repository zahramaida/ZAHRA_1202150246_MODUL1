package com.example.android.zahramaida_1202150246_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView Restoran;
    TextView Menu;
    TextView Porsi;
    TextView Harga;

    String resto,menu;
    int portion,harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Restoran = (TextView) findViewById(R.id.Resto);
        Menu = (TextView) findViewById(R.id.Menu);
        Porsi = (TextView) findViewById(R.id.Portion);
        Harga = (TextView) findViewById(R.id.Harga);

        Intent intent = getIntent();

        resto = intent.getStringExtra("Restoran");
        menu = intent.getStringExtra("Menu");
        portion = intent.getIntExtra("Porsi",0);
        harga = intent.getIntExtra("Harga",0);

        Restoran.setText(resto);
        Menu.setText(menu);
        Porsi.setText(""+portion);
        Harga.setText("Rp "+harga);

        if(harga < 65500){
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }

    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

