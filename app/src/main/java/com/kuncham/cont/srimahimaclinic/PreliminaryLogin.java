package com.kuncham.cont.srimahimaclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PreliminaryLogin extends AppCompatActivity {

    Button login;
    TextView create_account,forget_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preliminary_login);

        login=(Button)findViewById(R.id.login_submit);
        create_account=(TextView)findViewById(R.id.login_joinnow);
        forget_password=(TextView)findViewById(R.id.login_forget);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(PreliminaryLogin.this,PreliminaryData.class);
                startActivity(it);
            }
        });

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(PreliminaryLogin.this,PreliminaryAccount.class);
                startActivity(it);
            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(PreliminaryLogin.this,ForgetPassword.class);
                startActivity(it);
            }
        });

    }
}
