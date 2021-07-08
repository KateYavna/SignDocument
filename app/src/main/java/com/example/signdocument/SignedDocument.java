package com.example.signdocument;

import android.util.Log;

public class SignedDocument extends Document{
    String signe;

    SignedDocument (String title, String text,String signe){
        super(title, text);
        this.signe = signe;

    }


    @Override
    public void print (){
        super.print();
        Log.d("MyLog", signe);
    }
}
