package com.example.androidassignment.Assigment;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.androidassignment.R;
import com.example.androidassignment.databinding.ActivityQuestionSevenBinding;

public class QuestionSevenActivity extends AppCompatActivity {

    ActivityQuestionSevenBinding binding;
     ClipboardManager clipboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question_seven);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        // Inflate the context menu from menu resource
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Editable text = binding.editText.getText();
        int start = binding.editText.getSelectionStart();
        int end = binding.editText.getSelectionEnd();

        int itemId = item.getItemId();
        if (itemId == R.id.cut) {
            if (start != end) {
                ClipData clip = ClipData.newPlainText("Cut Text", text.subSequence(start, end));
                clipboard.setPrimaryClip(clip);
                text.delete(start, end);
            }
            return true;
        } else if (itemId == R.id.copy) {
            if (start != end) {
                ClipData clip = ClipData.newPlainText("Copied Text", text.subSequence(start, end));
                clipboard.setPrimaryClip(clip);
            }
            return true;
        } else if (itemId == R.id.paste) {
            ClipData clipData = clipboard.getPrimaryClip();
            if (clipData != null && clipData.getItemCount() > 0) {
                CharSequence pasteData = clipData.getItemAt(0).getText();
                text.insert(start, pasteData);
            }
            return true;
        } else if (itemId == R.id.select_all) {
            Selection.selectAll(text);
            return true;
        } else if (itemId == R.id.bold) {
            binding.editText.setTypeface(null, Typeface.BOLD);
            return true;
        } else if (itemId == R.id.italic) {
            binding.editText.setTypeface(null, Typeface.ITALIC);
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

}