package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionSixBinding;

public class QuestionSixActivity extends AppCompatActivity {

    ActivityQuestionSixBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_six);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu and add items
        getMenuInflater().inflate(R.menu.course_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle menu item clicks
        int itemId = item.getItemId();
        if(itemId == R.id.course_computer_science){
            binding.courseTextView.setText("Selected Course: Computer Science");
            return true;
        }else if(itemId == R.id.course_information_technology){
            binding.courseTextView.setText("Selected Course: Information Technology");
            return true;
        }else if(itemId == R.id.course_electronics){
            binding.courseTextView.setText("Selected Course: Electronics Engineering");
            return true;
        }else if(itemId == R.id.course_mechanical){
            binding.courseTextView.setText("Selected Course: Mechanical Engineering");
            return true;
        }else if(itemId == R.id.course_civil){
            binding.courseTextView.setText("Selected Course: Civil Engineering");
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }
}