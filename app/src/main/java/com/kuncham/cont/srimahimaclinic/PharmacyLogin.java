package com.kuncham.cont.srimahimaclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PharmacyLogin extends AppCompatActivity {

   Button login;
   TextView forget,create,joinnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_login);
        login=(Button)findViewById(R.id.login_submit);
        forget=(TextView)findViewById(R.id.login_forget);
        create=(TextView)findViewById(R.id.login_create);
        joinnow=(TextView)findViewById(R.id.login_joinnow);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent it=new Intent(PharmacyLogin.this,Pharmacydata.class);
                    startActivity(it);

            }

        });
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it=new Intent(PharmacyLogin.this,ForgetPassword.class);
                startActivity(it);

            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it=new Intent(PharmacyLogin.this,PharmacyLogin.class);
                startActivity(it);

            }
        });
       joinnow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent it=new Intent(PharmacyLogin.this,PharmacyLogin.class);

                startActivity(it);


           }
       });

    }
}
