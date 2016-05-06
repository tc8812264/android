package com.example.alibaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Button view = (Button)findViewById(R.id.button2);
        view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent in = new Intent();
                in.setClass(IndexActivity.this,RegisterActivity.class);
                startActivity(in);
            }
        });
        Button view1 = (Button)findViewById(R.id.button);
        view1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent in = new Intent();
                in.setClass(IndexActivity.this,ZhuceActivity.class);
                startActivity(in);
            }
        });
    }
}
