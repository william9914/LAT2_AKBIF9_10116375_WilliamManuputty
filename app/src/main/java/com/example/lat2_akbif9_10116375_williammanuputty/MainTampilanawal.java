package com.example.lat2_akbif9_10116375_williammanuputty;
/*
Nama : William Manuputty
NIM  : 10116375
KELAS : AKB-IF9
Tanggal Pengerjaan : 18 April 2019
*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainTampilanawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanawal);
    }
    public void register (View view ){
        Intent intent = new Intent (MainTampilanawal.this,MainDaftar.class);
        startActivity(intent);
    }

}
