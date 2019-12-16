package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

     EditText e1,e2;
     Button btn;
     RadioGroup rg;
     RadioButton rb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1= findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        btn=findViewById(R.id.btn);
        int idd=rg.getCheckedRadioButtonId();
        rb=findViewById(idd);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb.getText().equals("Dollars")){
                    int a= Integer.parseInt(e1.getText().toString());
                    e2.setText(String.valueOf(a*0.014));
                }
                else if(rb.getText().equals("Euros")){
                    int a= Integer.parseInt(e1.getText().toString());
                    e2.setText(String.valueOf(a*0.013));
                }
                else if(rb.getText().equals("Yens")){
                    int a= Integer.parseInt(e1.getText().toString());
                    e2.setText(String.valueOf(a*0.65));
                }

            }
        });
    }
}
