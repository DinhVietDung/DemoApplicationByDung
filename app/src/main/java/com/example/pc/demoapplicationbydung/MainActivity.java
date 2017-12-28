package com.example.pc.demoapplicationbydung;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText edtUserName;
    EditText edtPassWord;
    EditText edtCode;
    Button btnLogin, btnSignUp;
    int counter =5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserName= findViewById(R.id.username_edt);
        edtPassWord= findViewById(R.id.pass_edt);
        edtCode= findViewById(R.id.code_edt);
        btnLogin= findViewById(R.id.login_button);
        btnSignUp= findViewById(R.id.signup_button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtUserName.getText().toString().equals("dinhvietdung")&&
                        edtPassWord.getText().toString().equals("Dung22101997") &&
                        edtCode.getText().toString().equals("1997")){
                        Toast.makeText(MainActivity.this, "Connecting...", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(MainActivity.this, "Incorrect username or password.", Toast.LENGTH_LONG).show();
                    edtUserName.setVisibility(View.VISIBLE);
                    counter--;
                    if(counter==0){
                        btnLogin.setEnabled(false);
                        Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        }

        // commont jjasbjjas

        // branch


        }




