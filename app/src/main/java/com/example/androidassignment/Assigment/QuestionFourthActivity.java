package com.example.androidassignment.Assigment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityMainBinding;
import com.example.androidassignment.databinding.ActivityQuestionFourthBinding;

public class QuestionFourthActivity extends AppCompatActivity {


    ActivityQuestionFourthBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_fourth);
        binding.btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShapeActivity.class);
                intent.putExtra("shapeValue","Circle");
                startActivity(intent);
            }
        });
        binding.btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShapeActivity.class);
                intent.putExtra("shapeValue","Recentangle");
                startActivity(intent);
            }
        });
        binding.btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShapeActivity.class);
                intent.putExtra("shapeValue","Square Shape");
                startActivity(intent);
            }
        });
    }
}