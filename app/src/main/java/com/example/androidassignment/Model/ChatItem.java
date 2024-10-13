package com.example.androidassignment.Model;

public class ChatItem {
    private String title;
    private String message;
    private String time;
    private int imageResId;

    public ChatItem(String title, String message, String time, int imageResId) {
        this.title = title;
        this.message = message;
        this.time = time;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public int getImageResId() {
        return imageResId;
    }
}
