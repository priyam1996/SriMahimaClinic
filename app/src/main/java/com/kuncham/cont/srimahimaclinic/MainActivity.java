package com.kuncham.cont.srimahimaclinic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button front,doctor,pharmacy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        front=(Button)findViewById(R.id.bt_front);
        doctor=(Button)findViewById(R.id.bt_doctors);
        pharmacy=(Button)findViewById(R.id.bt_pharmacy);


        front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(MainActivity.this,PreliminaryLogin.class);
                startActivity(it);
            }
        });

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(MainActivity.this,DoctorsLogin.class);
                startActivity(it);
            }
        });

        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(MainActivity.this,PharmacyLogin.class);
                startActivity(it);
            }
        });

    }
}
