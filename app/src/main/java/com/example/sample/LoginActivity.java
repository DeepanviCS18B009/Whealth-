package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Username;
    EditText Password;
    Button Login;
    TextView Register;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db= new Database(this);
        Username = (EditText)findViewById(R.id.edittext_username);
        Password = (EditText)findViewById(R.id.edittext_password);
        Login = (Button)findViewById(R.id.button_login);
        Register = (TextView)findViewById(R.id.textview_register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= Username.getText().toString().trim();
                String pwd= Password.getText().toString().trim();
                boolean result= db.checkUser(user, pwd);
                if(result==true)
                {
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent movetothird = new Intent(LoginActivity.this, ThirdActivity.class);
                    startActivity(movetothird);
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Login Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
