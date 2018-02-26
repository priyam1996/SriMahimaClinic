package com.kuncham.cont.srimahimaclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pharmacydata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacydata);
    }


    public void submit(View view) {

        Intent it=new Intent(this,Pharmacydetails.class);
          startActivity(it);

    }
}
