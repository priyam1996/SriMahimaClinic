package com.kuncham.cont.srimahimaclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreliminaryAccount extends AppCompatActivity {

    Button account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preliminary_account);

        account=(Button)findViewById(R.id.bt_create);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it=new Intent(PreliminaryAccount.this,PreliminaryData.class);
                startActivity(it);
            }
        });
    }
}
