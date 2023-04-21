package com.example.common.utils;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ServicesHelper {

    private static ServicesHelper _instance = new ServicesHelper();
    public Class<? extends AppCompatActivity> game_activity;
    private ServicesHelper(){

    }
    public static ServicesHelper get_instance(){
        return _instance;
    }



    public Class<? extends AppCompatActivity> getGame_activity() {
        return game_activity;
    }

    public void setGame_activity(Class<? extends AppCompatActivity> game_activity) {
        this.game_activity = game_activity;
    }
}
