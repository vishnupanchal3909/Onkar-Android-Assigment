package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionEightBinding;

public class QuestionEightActivity extends AppCompatActivity {

    ActivityQuestionEightBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_eight);
        init();
    }
    void init(){
        binding.coffeeButton.setOnClickListener(v -> showCoffeePopup(v));
    }
    private void showCoffeePopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.coffee_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(this::onCoffeeSelected);
        popupMenu.show();
    }

    private boolean onCoffeeSelected(MenuItem item) {
        String coffeeType = item.getTitle().toString();
        binding.selectedCoffeeTextView.setText("Selected Coffee: " + coffeeType);
        setCoffeeImage(coffeeType);
        return true;
    }

    private void setCoffeeImage(String coffeeType) {
        int resId;
        switch (coffeeType) {
            case "Americano":
                resId = R.drawable.ic_launcher_background;
                break;
            case "Latte":
                resId = R.drawable.ic_launcher_foreground;
                break;
            case "Espresso":
                resId = R.drawable.ic_launcher_background;
                break;
            case "Cappuccino":
                resId = R.drawable.ic_launcher_foreground;
                break;
            case "Mocha":
                resId = R.drawable.ic_launcher_background;
                break;
            case "Skinny Latte":
                resId = R.drawable.ic_launcher_foreground;
                break;
            case "Espresso Corretto":
                resId = R.drawable.ic_launcher_background;
                break;
            default:
                resId = R.drawable.ic_launcher_foreground; // Add a default image if needed
                break;
        }
        binding.coffeeImageView.setImageResource(resId);
    }
}