package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.Adapter.ChatAdapter;
import com.example.androidassignment.Model.ChatItem;
import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionFourteenBinding;

import java.util.ArrayList;

public class QuestionFourteenActivity extends AppCompatActivity {

    ActivityQuestionFourteenBinding binding;
    private ListView listView;
    private ArrayList<ChatItem> chatItems;
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_question_fourteen);
        init();
    }
    void init(){
        listView = findViewById(R.id.listView);

        // Create an ArrayList of ChatItems
        chatItems = new ArrayList<>();
        chatItems.add(new ChatItem("John Doe", "Hey, how are you?", "12:00 PM", R.drawable.ic_launcher_background));
        chatItems.add(new ChatItem("Jane Smith", "Lunch at 1?", "11:45 AM", R.drawable.ic_launcher_foreground));
        chatItems.add(new ChatItem("Mike Ross", "See you tomorrow.", "10:30 AM", R.drawable.ic_launcher_background));
        chatItems.add(new ChatItem("Rachel Green", "Meeting at 3 PM.", "9:15 AM", R.drawable.ic_launcher_foreground));

        // Set up the custom adapter
        chatAdapter = new ChatAdapter(this, chatItems);
        listView.setAdapter(chatAdapter);
    }
}