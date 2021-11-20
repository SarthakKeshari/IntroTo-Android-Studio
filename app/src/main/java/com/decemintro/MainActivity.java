package com.decemintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name_input, email_input, password_input;
    Button btn_register;
    TextView info_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_input = findViewById(R.id.name_input);
        email_input = findViewById(R.id.email_input);
        password_input = findViewById(R.id.password_input);
        btn_register = findViewById(R.id.btn_register);
        info_text = findViewById(R.id.info_text);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name_input.getText().toString();
                String email = email_input.getText().toString();
                String password = password_input.getText().toString();

                String msg = "Name :"+name+"\nEmail : "+email+"\nPassword : "+password;

                Log.d("MainActivity",msg);
                info_text.setText(msg);

                Intent dataintent = new Intent(getApplicationContext(),MainActivity2.class);
                dataintent.putExtra("message",msg);
                startActivity(dataintent);

            }
        });

    }
}