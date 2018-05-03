package com.example.android.minesweeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by android on 5/3/18.
 */

public class rules extends AppCompatActivity{
    private TextView desc;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        desc=findViewById(R.id.rules);
    }

}
