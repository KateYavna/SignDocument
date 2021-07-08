package com.example.signdocument;

import android.util.Log;

public class DataSignedDocument extends Document{
    String data;
    String sign;

    DataSignedDocument (String title, String text,String signe,String data){
        super(title,text);
        this.data = data;
        this.sign = signe;
    }

    @Override
    public void print (){
        Log.d("MyLog", data);
        super.print();
        Log.d("MyLog", sign);
    }
}
