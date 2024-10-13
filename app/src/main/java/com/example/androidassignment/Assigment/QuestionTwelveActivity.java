package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionTwelveBinding;

public class QuestionTwelveActivity extends AppCompatActivity {

    ActivityQuestionTwelveBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_twelve);
        init();
    }
    void init(){
        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the rating value
                float rating = binding.ratingBar.getRating();

                // Display the rating value in the TextView
                binding.ratingText.setText("Your rating: " + rating);

                // Show a Toast message
                Toast.makeText(QuestionTwelveActivity.this, "Thank you for rating Swigatto!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}