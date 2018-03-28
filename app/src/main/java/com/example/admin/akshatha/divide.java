package com.example.admin.akshatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class divide extends AppCompatActivity {
    TextView tv1,tv2;
    EditText ed1,ed2;
    Integer a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);
        tv1 = (TextView)findViewById(R.id.div_textView4);
        tv2 = (TextView)findViewById(R.id.div_textView5);
        ed1 = (EditText)findViewById(R.id.div_editText);
        ed2 = (EditText)findViewById(R.id.div_editText2);
        newprob();
    }

    public void newprob() {
        Random r = new Random();
        a = r.nextInt( 1000 - 900) + 7000;
        b = r.nextInt( 100 - 50) + 10;
        tv1.setText("   "+a+" ");
        tv2.setText("by "+b+" ");
        if (a>b) {
            c = a / b;
            d = a%b;
        }
        else{
            newprob();
        }
        ed1.getText().clear();
        ed2.getText().clear();
    }

    public void main(View view) {
        Intent intent = new Intent(divide.this,MainActivity.class);
        startActivity(intent);
    }

    public void checknext(View view) {

            String value= ed1.getText().toString();
            int finalValue=Integer.parseInt(value);
            String value1= ed2.getText().toString();
            int finalValue1=Integer.parseInt(value1);
            if (c == finalValue && d == finalValue1){
                Toast.makeText(getApplicationContext(), "Good!! Keep it up" , Toast.LENGTH_LONG).show();
                newprob();
            }else{
                Toast.makeText(getApplicationContext(), "Wrong!! Try again" , Toast.LENGTH_LONG).show();
            }
        }}


