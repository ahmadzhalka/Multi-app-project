package com.example.common;

import android.app.Application;

import java.util.ArrayList;


public abstract class App_Parent extends Application {

    public static ArrayList<Integer> nums=new ArrayList<>();



    @Override
    public void onCreate() {
        super.onCreate();
        nums=this.getNums();
        setGameActivity();
    }

    public abstract  void setGameActivity();
    protected abstract ArrayList<Integer> getNums();



}
