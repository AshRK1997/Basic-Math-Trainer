package com.example.admin.akshatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class cuberoot extends AppCompatActivity {
    TextView tv1;

    EditText ed1;
    Integer a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuberoot);
        tv1 = (TextView)findViewById(R.id.cu_textView5);
        ed1 = (EditText)findViewById(R.id.cu_editText);
        newprob();
    }
    public void checknext(View view) {

        if (ed1.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Empty BOX", Toast.LENGTH_LONG).show();
        }else{
            String value= ed1.getText().toString();
            int finalValue=Integer.parseInt(value);
        if (a == finalValue){
            Toast.makeText(getApplicationContext(), "Good!! Keep it up" , Toast.LENGTH_LONG).show();
            newprob();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong!! Try again" , Toast.LENGTH_LONG).show();
        }
    }}

    public void main(View view) {
        Intent intent = new Intent(cuberoot.this,MainActivity.class);
        startActivity(intent);
    }

    public void newprob(){
        Random r = new Random();
        a = r.nextInt( 51 - 1) + 1;
        b = a*a*a;
        tv1.setText(b + " ");
        ed1.getText().clear();
    }
}
