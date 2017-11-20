package com.i034114.surveygame.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.i034114.surveygame.R;

public class Activity_Register extends AppCompatActivity {

    Button btnLinkToLoginScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__register);

        btnLinkToLoginScreen = (Button) findViewById(R.id.btnLinkToLoginScreen);

        btnLinkToLoginScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                logoutLogin();
            }
        });
    }

    private void logoutLogin() {
        Intent intent = new Intent(this, Activity_Login.class);
        startActivity(intent);
    }
}
