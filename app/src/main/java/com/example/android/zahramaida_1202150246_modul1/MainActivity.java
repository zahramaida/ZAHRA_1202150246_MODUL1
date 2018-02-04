package com.example.android.zahramaida_1202150246_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText makanan;
    EditText jumlah;

    String Restoran,Menu;
    int Porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makanan = (EditText)findViewById(R.id.Makanan);
        jumlah = (EditText)findViewById(R.id.jumlahPorsi);
    }

    public void eatbus(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        Restoran = "EATBUS";
        Menu = makanan.getText().toString();
        Porsi= Integer.parseInt(jumlah.getText().toString());
        int price = 50000*Porsi;
        Log.d("total harga","Rp."+price);
        intent.putExtra("Restoran",Restoran); //mengembalikan data ke SecondActiviy
        intent.putExtra("Menu",Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",price);
        startActivity(intent);

    }

    public void abnormal(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        Restoran = "ABNORMAL";
        Menu = makanan.getText().toString();
        Porsi = Integer.parseInt(jumlah.getText().toString());
        int price = 30000*Porsi;
        intent.putExtra("Restoran",Restoran); //mengembalikan data ke SecondActivity
        intent.putExtra("Menu",Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",price);
        startActivity(intent);

    }
}
