package com.i034114.surveygame.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.i034114.surveygame.Helpers.SqliteHelper;
import com.i034114.surveygame.R;

public class Activity_Login extends AppCompatActivity {

    SqliteHelper sqliteHelper = new SqliteHelper(this," db_Users", null, 1);
    private Button btnLinkToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);

        btnLinkToRegister = (Button) findViewById(R.id.btnLinkToRegisterScreen);


        btnLinkToRegister.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Activity_Register.class);
                startActivity(i);
            }
        });



    }


    //public void onButtonClick(View view){
        //if(view.getId() == R.id.btnLogin){
            //EditText a = (EditText) findViewById(R.id.email);
            //String str = a.getText().toString();
            //EditText b = (EditText) findViewById(R.id.password);
            //String pass = b.getText().toString();

            //String password = sqliteHelper.searchPass(str);
            //if(pass.equals(password)){
                //Intent i = new Intent(this,ActivityEncuesta.class);
                //i.putExtra("name",str);
                //startActivity(i);
            //}else{
                //Toast temp = Toast.makeText(this, "name and Password no coincide", Toast.LENGTH_SHORT);
                //temp.show();

            //}

       // }
    //}

}
