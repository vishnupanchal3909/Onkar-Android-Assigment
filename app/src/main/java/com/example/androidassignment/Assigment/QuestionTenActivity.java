package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionTenBinding;

public class QuestionTenActivity extends AppCompatActivity {

    ActivityQuestionTenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_ten);
        init();
    }
    void init(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);

        binding.buttonShowSelections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder selections = new StringBuilder();

                // Spinner selection
                selections.append("Spinner: ").append(binding.spinner.getSelectedItem().toString()).append("\n");

                // CheckBox selections
                selections.append("CheckBox 1: ").append(binding.checkbox1.isChecked() ? "Checked" : "Unchecked").append("\n");
                selections.append("CheckBox 2: ").append(binding.checkbox2.isChecked() ? "Checked" : "Unchecked").append("\n");

                // RadioButton selection
                int selectedRadioId = binding.radioGroup.getCheckedRadioButtonId();
                if (selectedRadioId == R.id.radio_male) {
                    selections.append("Gender: Male\n");
                } else if (selectedRadioId == R.id.radio_female) {
                    selections.append("Gender: Female\n");
                }

                // Switch selection
                selections.append("Notifications: ").append(binding.switchNotifications.isChecked() ? "Enabled" : "Disabled").append("\n");

                // ToggleButton selection
                selections.append("Dark Mode: ").append(binding.toggleButtonDarkmode.isChecked() ? "On" : "Off").append("\n");

                // Show selections as a Toast
                Toast.makeText(QuestionTenActivity.this, selections.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}