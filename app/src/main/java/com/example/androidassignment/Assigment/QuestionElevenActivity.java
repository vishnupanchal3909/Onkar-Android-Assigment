package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionElevenBinding;

public class QuestionElevenActivity extends AppCompatActivity {

    ActivityQuestionElevenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_question_eleven);
        init();
    }
    void init(){
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Update ProgressBar and TextView
                binding.progressBar.setProgress(progress);
                binding.progressBarHorizontal.setProgress(progress);
                binding.seekBarValue.setText("Progress: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // This method can be used to handle touch events (optional)
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // This method can be used when tracking stops (optional)
            }
        });
    }
}