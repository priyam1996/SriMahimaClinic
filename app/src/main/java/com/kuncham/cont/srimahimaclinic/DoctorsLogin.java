package com.kuncham.cont.srimahimaclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoctorsLogin extends AppCompatActivity {

    Button login;
    TextView create_account,forget_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_login);

        login=(Button)findViewById(R.id.docter_login_submit);
        create_account=(TextView)findViewById(R.id.docter_login_joinnow);
        forget_password=(TextView)findViewById(R.id.docter_login_forget);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(DoctorsLogin.this,DoctersData.class);
                startActivity(it);
            }
        });

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(DoctorsLogin.this,DoctersAccount.class);
                startActivity(it);
            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(DoctorsLogin.this,ForgetPassword.class);
                startActivity(it);
            }
        });


    }
}
