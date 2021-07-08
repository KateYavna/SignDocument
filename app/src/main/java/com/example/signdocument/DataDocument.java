package com.example.signdocument;

import android.util.Log;

public class  DataDocument extends Document{
    String data;

    DataDocument (String title, String text,String data){
        super(title, text);
        this.data = data;
    }
    @Override
    public void print(){
        Log.d("MyLog", data);
        super.print();

    }
}
