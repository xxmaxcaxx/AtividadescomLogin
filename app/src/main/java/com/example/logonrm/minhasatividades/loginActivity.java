package com.example.logonrm.minhasatividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    private EditText etLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = (EditText) findViewById(R.id.etLogin);
    }

    public void login(View view){

        String login = etLogin.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("usuario",login);

        startActivity(intent);
        finish();
    }
}
