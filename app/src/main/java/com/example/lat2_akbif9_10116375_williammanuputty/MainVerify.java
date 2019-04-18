package com.example.lat2_akbif9_10116375_williammanuputty;
/*
Nama : William Manuputty
NIM  : 10116375
KELAS : AKB-IF9
Tanggal Pengerjaan : 18 April 2019
*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainVerify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
    public void Home(View view){
        Intent intent = new Intent(MainVerify.this,MainHome.class);
        startActivity(intent);
    }
}