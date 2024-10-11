package com.example.androidassignment.Assigment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityMainBinding;
import com.example.androidassignment.databinding.ActivityQuestionFifthBinding;

public class QuestionFifthActivity extends AppCompatActivity {

    ActivityQuestionFifthBinding binding;
    private DatePicker datePicker;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_fifth);
        init();
    }
    void init(){

        DatePicker datePicker = findViewById(R.id.datePicker);
        TimePicker timePicker = findViewById(R.id.timePicker);

        binding.pickDateButton.setOnClickListener(v -> showDatePickerDialog());
        binding.pickTimeButton.setOnClickListener(v -> showTimePickerDialog());

        // Set listeners for DatePicker and TimePicker Views
        datePicker.init(Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
                (view, year, monthOfYear, dayOfMonth) -> {
                    String date = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                    binding.dateTextView.setText("Selected Date: " + date);
                });

        timePicker.setOnTimeChangedListener((view, hourOfDay, minute) -> {
            String time = hourOfDay + ":" + String.format("%02d", minute);
            binding.timeTextView.setText("Selected Time: " + time);
        });
    }
    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    String date = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    binding.dateTextView.setText("Selected Date: " + date);
                }, year, month, day);
        datePickerDialog.show();
    }
    private void showTimePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                (view, hourOfDay, selectedMinute) -> {
                    String time = hourOfDay + ":" + String.format("%02d", selectedMinute);
                    binding.timeTextView.setText("Selected Time: " + time);
                }, hour, minute, true);
        timePickerDialog.show();
    }
}