package com.example.androidassignment.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidassignment.Model.ChatItem;
import com.example.androidassignment.R;

import java.util.ArrayList;

public class ChatAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<ChatItem> chatItems;

    public ChatAdapter(Context context, ArrayList<ChatItem> chatItems) {
        this.context = context;
        this.chatItems = chatItems;
    }

    @Override
    public int getCount() {
        return chatItems.size();
    }

    @Override
    public Object getItem(int position) {
        return chatItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        // Get the views from list_item.xml
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView mainTitle = convertView.findViewById(R.id.mainTitle);
        TextView subTitle = convertView.findViewById(R.id.subTitle);
        TextView timeText = convertView.findViewById(R.id.timeText);

        // Get the current ChatItem
        ChatItem chatItem = chatItems.get(position);

        // Set the values from the ChatItem
        imageView.setImageResource(chatItem.getImageResId());
        mainTitle.setText(chatItem.getTitle());
        subTitle.setText(chatItem.getMessage());
        timeText.setText(chatItem.getTime());

        return convertView;
    }
}
