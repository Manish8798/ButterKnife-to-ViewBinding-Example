package com.example.butterknifetoviewbindingexample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.butterknifetoviewbindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView.setText("Sample Text ViewBinding");
        binding.btnChange.setOnClickListener(v -> btnClick());
        binding.imageView.setOnClickListener(v -> imgClick());
    }

    void btnClick() {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void imgClick() {
        Toast.makeText(this, "Image Clicked", Toast.LENGTH_SHORT).show();
    }
}