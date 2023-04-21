package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class GraphActivity extends AppCompatActivity {
    ArrayList bararr;
    private GameManager gm=new GameManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        BarChart barChart=findViewById(R.id.barchart);
        getData();
        BarDataSet barDataSet=new BarDataSet(bararr,"adada");
        BarData barData=new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(2f);
        barChart.getDescription().setEnabled(true);
    }
    private void getData(){
        bararr=new ArrayList();
        Log.d("x1", ""+gm.getSize());
        for (int i = 0; i <gm.getSize() ; i++) {
            float x= (float) gm.getArr().get(i);
            bararr.add(new BarEntry(i+1,x));

        }


    }
}