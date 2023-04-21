package com.example.common;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public    class HomeActivity extends AppCompatActivity {
    private GameManager gameManager=new GameManager();
    //public abstract void init_game_manager() ;
    private Button common_BTN_submit;
    private AppCompatImageView COMMOR_IMG;
    private EditText common_num;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        COMMOR_IMG=findViewById(R.id.COMMOR_IMG);
        common_BTN_submit=findViewById(R.id.common_BTN_submit);
        common_num=findViewById(R.id.common_num);
        common_BTN_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Log.d("fff", ""+Integer.parseInt(String.valueOf(common_num.getText())));
               gameManager.setNum(Integer.parseInt(String.valueOf(common_num.getText())));
               gameManager.save(Integer.parseInt(String.valueOf(common_num.getText())));
                Log.d("x2", ""+Integer.parseInt(String.valueOf(common_num.getText())));
               // Log.d("x1", ""+gameManager.getArr());

                Intent intent = new Intent(HomeActivity.this, GraphActivity.class);
                startActivity(intent);
            }
        });
    }




}