package com.example.signdocument;

import android.util.Log;

public class Document {
    String title;
    String text;

    Document (String title, String text){
        this.title = title;
        this.text = text;
    }
    public void print (){
        Log.d("MyLog", title);
        Log.d("MyLog", text);
    }
    public void  save(){
        Log.d("MyLog", "This document saved");
    }
}
