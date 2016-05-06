package com.example.alibaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ImageView view = (ImageView)findViewById(R.id.backIndex);
        view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent in = new Intent();
                in.setClass(RegisterActivity.this,IndexActivity.class);
                startActivity(in);
            }
        });
        TextView view1 = (TextView)findViewById(R.id.zhuce);
        view1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent in = new Intent();
                in.setClass(RegisterActivity.this,ZhuceActivity.class);
                startActivity(in);
            }
        });
    }
}
