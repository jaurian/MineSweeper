package com.example.android.minesweeper;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
private GridLayout grid;
private ImageView imageview;
private Drawable image;
private Drawable image1;
private int Score;
private TextView scorev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=findViewById(R.id.grid);
        Score=0;
        scorev=findViewById(R.id.ScoreView);
        image1 = getResources().getDrawable(R.drawable.leafy_kitty);
        image = getResources().getDrawable(R.drawable.gameover);



        for(int i=0;i<100;i++) {
            imageview = (ImageView) getLayoutInflater().inflate(R.layout.image_layout, grid, false);
            grid.addView(imageview);

        }

        }

        public void onclick(View v){
        GridLayout g= (GridLayout) v.getParent();
        Random x=new Random();
        int z=x.nextInt(100)+1;
        if(z<=15){
            ((ImageView)v).setImageDrawable(image);
            Toast.makeText(this, "BOOM", Toast.LENGTH_LONG).show();
            reset(g);

        }else{
            ((ImageView)v).setImageDrawable(image1);
            Score++;
            scorev.setText("Score: "+ Score);
        }v.setClickable(false);
        }

        public void reset(GridLayout g){
            g.removeAllViews();
            for(int i=0;i<100;i++){
                ImageView v= (ImageView) getLayoutInflater().inflate(R.layout.image_layout, grid,false);
                g.addView(v);
                Score=0;
            }
        }
        public void rulePressed(View v){
            Intent x=new Intent(this, rules.class);
            startActivity(x);
        }
    }


