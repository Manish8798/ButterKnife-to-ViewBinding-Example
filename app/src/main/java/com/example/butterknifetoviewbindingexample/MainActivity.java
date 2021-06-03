package com.example.butterknifetoviewbindingexample;

import android.os.Bundle;
import android.view.View;
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

        binding.textView.setText("Text ViewBinding");
        binding.btnChange.setOnClickListener(clickListener);
        binding.imageView.setOnClickListener(clickListener);
        binding.textView.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = v -> {
        if (v == binding.btnChange) {
            btnClick();
        }
        if (v == binding.imageView) {
            imgClick();
        }
        if (v == binding.textView) {
            textClick();
        }
    };

    void btnClick() {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void imgClick() {
        Toast.makeText(this, "Image Clicked", Toast.LENGTH_SHORT).show();
    }

    public void textClick() {
        Toast.makeText(this, "Text Clicked", Toast.LENGTH_SHORT).show();
    }
}