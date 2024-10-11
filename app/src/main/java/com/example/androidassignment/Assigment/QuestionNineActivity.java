package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityMainBinding;
import com.example.androidassignment.databinding.ActivityQuestionNineBinding;

public class QuestionNineActivity extends AppCompatActivity {

    ActivityQuestionNineBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question_nine);
        binding.closeAppButton.setOnClickListener(this::showCloseAppDialog);
    }

    private void showCloseAppDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit Application")
                .setMessage("Do you want to close this application?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    // Close the app
                    finish(); // This will close the current activity
                })
                .setNegativeButton("No", (dialog, which) -> {
                    // Show a message and stay in the app
                    Toast.makeText(getApplicationContext(), "Continue with the same app", Toast.LENGTH_SHORT).show();
                })
                .setCancelable(false) // Optional: Prevent closing the dialog by tapping outside
                .show();
    }

}