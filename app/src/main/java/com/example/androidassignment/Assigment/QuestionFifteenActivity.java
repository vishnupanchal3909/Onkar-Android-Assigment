package com.example.androidassignment.Assigment;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionFifteenBinding;

public class QuestionFifteenActivity extends AppCompatActivity {

    ActivityQuestionFifteenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_fifteen);
        init();
    }
    void init(){
        WebSettings webSettings = binding.webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Ensure links open within the WebView instead of a browser
        binding.webview.setWebViewClient(new WebViewClient());

        // Load a web page
        binding.webview.loadUrl("https://www.google.com");
    }
    @Override
    public void onBackPressed() {
        if (binding.webview.canGoBack()) {
            binding.webview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}