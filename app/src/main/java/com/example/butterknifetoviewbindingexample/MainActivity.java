package com.example.butterknifetoviewbindingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.image_view)
    ImageView imageView;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textView.setText("Sample Text ButterKnife");
    }

    @OnClick(R.id.btn_change)
    void btnClick() {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }
}