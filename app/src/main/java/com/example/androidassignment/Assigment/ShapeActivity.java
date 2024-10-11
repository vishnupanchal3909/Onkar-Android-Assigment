package com.example.androidassignment.Assigment;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityShapeBinding;

public class ShapeActivity extends AppCompatActivity {

    Intent intent;
    String value;
    ActivityShapeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_shape);
        intent = getIntent();
        value = intent.getStringExtra("shapeValue");
        binding.textView3.setText(value);
    }
}