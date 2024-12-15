package com.example.math;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    TextView result;
    double num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 =findViewById(R.id.n1);
        n2 =findViewById(R.id.n2);
        result =findViewById(R.id.res);
    }
    public void plus(View view) {
        if(!(n1.getText().toString().isEmpty()|| n2.getText().toString().isEmpty())){
            num1=Double.parseDouble(n1.getText().toString());
            num2=Double.parseDouble(n2.getText().toString());
            result.setText(String.valueOf(num1+num2));
        }
    }
    public void minus(View view) {
        if(!(n1.getText().toString().isEmpty()|| n2.getText().toString().isEmpty())){
            num1=Double.parseDouble(n1.getText().toString());
            num2=Double.parseDouble(n2.getText().toString());
            result.setText(String.valueOf(num1+num2));
        }
    }
    public void mul(View view) {
        if(!(n1.getText().toString().isEmpty()|| n2.getText().toString().isEmpty())){
            num1=Double.parseDouble(n1.getText().toString());
            num2=Double.parseDouble(n2.getText().toString());
            result.setText(String.valueOf(num1+num2));
        }
    }
    public void div(View view) {
        if(!(n1.getText().toString().isEmpty()|| n2.getText().toString().isEmpty())){
            num1=Double.parseDouble(n1.getText().toString());
            num2=Double.parseDouble(n2.getText().toString());
            if(num2!=0)
                result.setText(String.valueOf(num1+num2));
        }
    }

}