package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText etNum1, etNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
    }

    public void addNumbers(View v) {
        double n1, n2, result;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        result = n1 + n2;
        textView.setText(String.valueOf(result));
    }

    public void clear(View v) {
        etNum1.setText("  ");
        etNum2.setText("  ");
        textView.setText("  ");
    }

    public void subNumbers(View v) {
        double n1, n2, result;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        result = n1 - n2;
        textView.setText(String.valueOf(result));
    }

    public void mulNumbers(View v) {
        double n1, n2, result;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        result = n1 * n2;
        textView.setText(String.valueOf(result));
    }

    public void divNumbers(View v) {
        double n1, n2, result;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        result = n1 / n2;
        textView.setText(String.valueOf(result));
    }
}

