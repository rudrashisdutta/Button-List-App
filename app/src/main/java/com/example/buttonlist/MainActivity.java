package com.example.buttonlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<String> arrylist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }
    private void setUI(){
        LinearLayout yourlayout= (LinearLayout) findViewById(R.id.yourlayout);
        setArrayAdapter();
        for (int i = 0; i < arrylist.size(); i++) {

            Button btn = new Button (MainActivity.this);
            btn.setWidth(yourlayout.getWidth());
            btn.setHeight(20);
            btn.setText(arrylist.get(i));
            yourlayout.addView(btn);
        }
    }
    private void setArrayAdapter(){
        for(int i=0;i<23;i++){
            arrylist.add(""+(i+1));
        }
    }
}