package com.example.shaka0241.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btlLogin;
    EditText editTextEmail, editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LOGCAT", "entrando al metodo onCreate");
        btlLogin = findViewById(R.id.buttonLogin);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btlLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Log.i("App", "Clic en login");
        String email = editTextEmail.getText().toString();
        String pass = editTextPassword.getText().toString();

        if (!email.isEmpty() && !pass.isEmpty()) {

            Intent intentLogin = new Intent(this, HomeActivity.class);
            intentLogin.putExtra("valorEmail",email);
            startActivity(intentLogin);

        }else{
            editTextEmail.setError("Complete los campos del formulario para el correcto logeo");
        }


    }
}
