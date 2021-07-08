package com.example.signdocument;

import android.util.Log;

public class Human {
    private String name;
    private String surname;

    Human (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName() {

        this.name = name;
    }

    public void setSurname() {

        this.surname = surname;
    }

}
