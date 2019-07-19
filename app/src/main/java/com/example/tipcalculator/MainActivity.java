package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText e1 ,e2;
    TextView t1;
    public void btn(View view)
    {

         Double d=Double.parseDouble(e1.getText().toString());
         Double d1=Double.parseDouble(e2.getText().toString());
         Double d2= (d1/ 100)*d;
         t1.setText(d2.toString());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.et);
        e2=(EditText)findViewById(R.id.et1);
        t1=(TextView)findViewById(R.id.tv2);
        Button b=(Button) findViewById(R.id.button);
    }

}
