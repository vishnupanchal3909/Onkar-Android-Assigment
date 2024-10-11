package com.example.androidassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.Assigment.QuestionEightActivity;
import com.example.androidassignment.Assigment.QuestionFifthActivity;
import com.example.androidassignment.Assigment.QuestionFirstActivity;
import com.example.androidassignment.Assigment.QuestionFourthActivity;
import com.example.androidassignment.Assigment.QuestionNineActivity;
import com.example.androidassignment.Assigment.QuestionSecondActivity;
import com.example.androidassignment.Assigment.QuestionSevenActivity;
import com.example.androidassignment.Assigment.QuestionSixActivity;
import com.example.androidassignment.Assigment.QuestionThirdActivity;
import com.example.androidassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }
    void init(){
        binding.btnQuestionFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionFirstActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionSecondActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionThirdActivity.class);
                startActivity(intent);
            }
        });

        binding.btnQuestionFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionFourthActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionFifthActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionSixActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionSevenActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionEightActivity.class);
                startActivity(intent);
            }
        });
        binding.btnQuestionNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuestionNineActivity.class);
                startActivity(intent);
            }
        });
    }
}