package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Database db;
    EditText Username;
    EditText Password;
    EditText CnfPassword;
    Button Register;
    TextView Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db= new Database(this);
        Username= (EditText)findViewById(R.id.edittext_username);
        Password=(EditText)findViewById(R.id.edittext_password);
        CnfPassword=(EditText)findViewById(R.id.edittext_cnf_password);
        Register=(Button)findViewById(R.id.button_login);
        Login=(TextView)findViewById(R.id.textview_register);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(LoginIntent);
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= Username.getText().toString().trim();
                String pwd= Password.getText().toString().trim();
                String cnfpwd= CnfPassword.getText().toString().trim();

                if(pwd.equals(cnfpwd))
                {
                    long value = db.addUser(user,pwd);
                    if(value > 0)
                    {
                        Toast.makeText(RegisterActivity.this,"You're now registered",Toast.LENGTH_SHORT).show();
                        Intent movenext = new Intent(RegisterActivity.this, ThirdActivity.class);
                        startActivity(movenext);
                    }
                    else
                    {
                        Toast.makeText(RegisterActivity.this,"Registration Error",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(RegisterActivity.this,"Passwords do not match",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
