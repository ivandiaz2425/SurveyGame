package com.i034114.surveygame.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.i034114.surveygame.Helpers.SqliteHelper;
import com.i034114.surveygame.Models.Users;
import com.i034114.surveygame.R;

public class Activity_Register extends AppCompatActivity {


    EditText name;
    EditText identification_card;
    EditText phone;
    EditText email;
    EditText password;
    EditText password1;
    EditText status;

    SqliteHelper sqliteHelper;

    private Button btnLinkToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__register);

        SqliteHelper sqliteHelper = new SqliteHelper(this," db_Users", null, 1);

        btnLinkToLogin = (Button) findViewById(R.id.btnLinkToLoginScreen);


        btnLinkToLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Activity_Login.class);
                startActivity(i);
            }
        });
    }

    public void onRegisterClick(View view){

        if(view.getId()==R.id.btnRegister){
            name = (EditText) findViewById(R.id.name);
            identification_card = (EditText) findViewById(R.id.Identificacion);
            phone = (EditText) findViewById(R.id.Telefono);
            email = (EditText) findViewById(R.id.email);
            password = (EditText) findViewById(R.id.password);
            password1 = (EditText) findViewById(R.id.password1);
            status = (EditText) findViewById(R.id.Status);

            String namestr = name.getText().toString();
            String identification_cardstr = identification_card.getText().toString();
            String phonestr = phone.getText().toString();
            String emailstr = email.getText().toString();
            String passwordstr = password.getText().toString();
            String passwordstr1 = password1.getText().toString();
            String statusstr = status.getText().toString();

            if(!passwordstr.equals(passwordstr1)){

                Toast pass = Toast.makeText(this, "Password no coincide", Toast.LENGTH_SHORT);
                pass.show();
            }
            else{

                Users U = new Users();
                U.setName(namestr);
                U.setIdentification_card(identification_cardstr);
                U.setPhone(phonestr);
                U.setEmail(emailstr);
                U.setPassword(passwordstr);
                U.setStatus(statusstr);

                sqliteHelper.insertUser(U);

            }
        }




    }
}
