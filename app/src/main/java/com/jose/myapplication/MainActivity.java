package com.jose.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etGasPrice, etEthanolPrice;
    private Button btnCalculate;
    private TextView tvResult;
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGasPrice = findViewById(R.id.etGasPrice);
        etEthanolPrice = findViewById(R.id.etEthanolPrice);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);
        ivLogo = findViewById(R.id.ivLogo);

        btnCalculate.setOnClickListener(view -> calculate());
    }

    private void calculate() {
        double gasPrice = Double.parseDouble(etGasPrice.getText().toString());
        double ethanolPrice = Double.parseDouble(etEthanolPrice.getText().toString());
        double index = ethanolPrice / gasPrice;

        String result = (index <= 0.7) ? "Abasteça com Etanol" : "Abasteça com Gasolina";
        tvResult.setText(result);
    }
}