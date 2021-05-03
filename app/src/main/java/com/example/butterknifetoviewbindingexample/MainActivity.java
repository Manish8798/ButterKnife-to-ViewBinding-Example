package com.example.butterknifetoviewbindingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.butterknifetoviewbindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //first let's run the app

    //Now start the migration

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