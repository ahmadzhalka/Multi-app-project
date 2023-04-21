package com.example.press1;


import com.example.common.App_Parent;
import com.example.common.utils.MySPV3;
import com.example.common.utils.ServicesHelper;

import java.util.ArrayList;


public class App1 extends App_Parent {

    @Override
    public void onCreate() {
        super.onCreate();
        MySPV3.init(this,"press");

    }
    @Override
    public void setGameActivity() {
        ServicesHelper.get_instance().setGame_activity(PapaerActivity.class);

    }

    @Override
    protected ArrayList<Integer> getNums() {
        ArrayList arr=new ArrayList<Integer>();
        return arr;
    }




}
