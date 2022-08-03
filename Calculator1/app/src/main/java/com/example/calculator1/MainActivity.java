package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView calculator = findViewById(R.id.textView);
        TextView enter = findViewById(R.id.textView1);
        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName1);
        TextView plus = findViewById(R.id.textView2);
        TextView multiplied = findViewById(R.id.textView3);
        TextView minus = findViewById(R.id.textView4);
        TextView divided = findViewById(R.id.textView5);
        Button calculate = findViewById(R.id.button2);
        TextView total = findViewById(R.id.textView0);



    }
}