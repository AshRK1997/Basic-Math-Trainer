package com.example.admin.akshatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class sqroot extends AppCompatActivity {
    TextView tv1;

    EditText ed1;
    Integer a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqroot);

        tv1 = (TextView)findViewById(R.id.textView5);
        ed1 = (EditText)findViewById(R.id.editText);
        newprob();
    }

    public void checknext(View view) {
        if (ed1.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Empty BOX", Toast.LENGTH_LONG).show();
        }else{
         final String hi = ed1.getText().toString();
        int finalValue=Integer.parseInt(hi);
        if (a == finalValue){
            Toast.makeText(getApplicationContext(), "Good!! Keep it up" , Toast.LENGTH_LONG).show();
            newprob();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong!! Try again" , Toast.LENGTH_LONG).show();
        }}
    }

    public void main(View view) {
        Intent intent = new Intent(sqroot.this,MainActivity.class);
        startActivity(intent);
    }

    public void newprob(){
        Random r = new Random();
        a = r.nextInt( 51 - 1) + 4;
        b = a*a;
        tv1.setText(b +" ");
        ed1.getText().clear();
    }
}
