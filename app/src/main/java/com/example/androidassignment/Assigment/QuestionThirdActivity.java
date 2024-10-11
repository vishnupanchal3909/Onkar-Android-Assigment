package com.example.androidassignment.Assigment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityMainBinding;
import com.example.androidassignment.databinding.ActivityQuestionThirdBinding;

public class QuestionThirdActivity extends AppCompatActivity {

    ActivityQuestionThirdBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_third);
        loadFragment(new LoginFragment());
    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null); // Optional, so the user can press back to return
        fragmentTransaction.commit();
    }

    // Method to switch between fragments (called from the fragments themselves)
    public void switchFragment(Fragment fragment) {
        loadFragment(fragment);
    }
}