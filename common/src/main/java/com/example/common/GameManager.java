package com.example.common;

import android.util.Log;

import com.example.common.utils.MySPV3;

import java.util.ArrayList;

public  class GameManager {
    private static int size=0;
    private static ArrayList arr=new ArrayList<Integer>();
    public GameManager() {
      arr=App_Parent.nums;
      load();

    }

    public static int getSize() {
        return size;
    }

    public static  void setNum(int num){
         Log.d("fff", ""+num);

        arr.add(num);

   }
    public static ArrayList<Integer> getArr() {
        return arr;
    }

    public static void save(int num) {
        MySPV3.getInstance().putInt("size", arr.size());
        MySPV3.getInstance().putInt("score"+(arr.size()-1),num);

        Log.d("message5", "saved"+arr.size());
    }

    public static void load() {
        Log.d("message5", "load"+MySPV3.DB_FILE);

       int x=MySPV3.getInstance().getInt("size",0);
        Log.d("message5", String.valueOf(x));

        size=x;
        Log.d("message5", String.valueOf(x));

        for (int i = 0; i <x ; i++) {
            Log.d("message5", String.valueOf(i));
            int a=MySPV3.getInstance().getInt("score"+i,0);

            setNum(a);
        }

    }
}
