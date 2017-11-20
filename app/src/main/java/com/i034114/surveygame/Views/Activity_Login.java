package com.i034114.surveygame.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.i034114.surveygame.R;

public class Activity_Login extends AppCompatActivity {

    private Button btnLinkToRegisterScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);

        btnLinkToRegisterScreen = (Button) findViewById(R.id.btnLinkToRegisterScreen);

        btnLinkToRegisterScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                logoutRegister();
            }
        });

    }

    private void logoutRegister() {
        Intent intent = new Intent(this, Activity_Register.class);
        startActivity(intent);
    }

}
