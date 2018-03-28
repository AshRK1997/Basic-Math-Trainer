package com.example.admin.akshatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class multiply extends AppCompatActivity {
    TextView tv1,tv2;
    EditText ed1;
    Integer a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);
        tv1 = (TextView)findViewById(R.id.mul_textView5);
        ed1 = (EditText)findViewById(R.id.mul_editText);
        tv2 = (TextView)findViewById(R.id.mul_textView4);
        newprob();
    }
    public void main(View view) {
        Intent intent = new Intent(multiply.this,MainActivity.class);
        startActivity(intent);
    }

    public void checknext(View view) {
        if (ed1.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Empty BOX", Toast.LENGTH_LONG).show();
        }else{
            String value= ed1.getText().toString();
            int finalValue=Integer.parseInt(value);
            if (c == finalValue){
                Toast.makeText(getApplicationContext(), "Good!! Keep it up" , Toast.LENGTH_LONG).show();
                newprob();
            }else{
                Toast.makeText(getApplicationContext(), "Wrong!! Try again" , Toast.LENGTH_LONG).show();
            }
        }}
    public void newprob(){
        Random r = new Random();
        a = r.nextInt( 10000 - 900) + 700;
        b = r.nextInt( 1000 - 100) + 29;
        tv1.setText("* "+b+" ");
        tv2.setText("  " + a+" ");
        c = a*b;
        ed1.getText().clear();
    }

}
