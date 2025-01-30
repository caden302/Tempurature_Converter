package com.example.tempuratureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.tempuratureconverter.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Fahrenheit = binding.FahTextBox.getText().toString();
                String Celsius = binding.CelTextBox.getText().toString();
                if(!Fahrenheit.isBlank()){
                    double celcius = Double.parseDouble(Fahrenheit);
                    celcius = (celcius - 32) * 5/9;
                    String temp = Double.toString(celcius);
                    binding.CelTextBox.setText(temp);
                } else if (!Celsius.isBlank()) {
                    double fahrenheit = Double.parseDouble(Celsius);
                    fahrenheit = (fahrenheit * 9/5) + 32;
                    String temp = Double.toString(fahrenheit);
                    binding.FahTextBox.setText(temp);
                }

            }
        });
    }
}