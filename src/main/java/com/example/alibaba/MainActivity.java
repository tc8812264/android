package com.example.alibaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    List<Map<String,Object>> list = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view1 = (TextView)findViewById(R.id.skipersoncenter);
        view1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent in = new Intent();
                in.setClass(MainActivity.this,Main2Activity.class);
                startActivity(in);
            }
        });
        SimpleDateFormat sdf=new SimpleDateFormat("M月d日");
        String date=sdf.format(new java.util.Date());
        list = new ArrayList<Map<String,Object>>();;
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("title","阿里笔试：为什么要虐你");
        map1.put("date",date);
        map1.put("content","二、流程\n" +
                "1. 网申截止时间：4月16日24:00点，请同学们抓紧哦，不要因此错过笔试机会\n" +
                "2. 模拟在线笔试：\n" +
                "时间：4月14日19:00-19:40\n" +
                "模拟目的：熟悉笔试流程/笔试设备，非真题模拟且成绩并不影响你的正式笔试，每人只有一次模拟的机会哦\n" +
                "模拟笔试对象：4月14日18:00前投递有效简历（网申+内推）的同学\n");
        list.add(map1);
        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("title","阿里实习生的惨痛经历");
        map2.put("date",date);
        map2.put("content","二、流程\n" +
                "1. 网申截止时间：4月16日24:00点，请同学们抓紧哦，不要因此错过笔试机会\n" +
                "2. 模拟在线笔试：\n" +
                "时间：4月14日19:00-19:40\n" +
                "模拟目的：熟悉笔试流程/笔试设备，非真题模拟且成绩并不影响你的正式笔试，每人只有一次模拟的机会哦\n" +
                "模拟笔试对象：4月14日18:00前投递有效简历（网申+内推）的同学\n");
        list.add(map2);
        Map<String,Object> map3 = new HashMap<String,Object>();
        map3.put("title","阿里巴巴欢迎您");
        map3.put("date",date);
        map3.put("content","二、流程\n" +
                "1. 网申截止时间：4月16日24:00点，请同学们抓紧哦，不要因此错过笔试机会\n" +
                "2. 模拟在线笔试：\n" +
                "时间：4月14日19:00-19:40\n" +
                "模拟目的：熟悉笔试流程/笔试设备，非真题模拟且成绩并不影响你的正式笔试，每人只有一次模拟的机会哦\n" +
                "模拟笔试对象：4月14日18:00前投递有效简历（网申+内推）的同学\n");
        list.add(map3);
        Map<String,Object> map4 = new HashMap<String,Object>();
        map4.put("title","阿里的福利");
        map4.put("date",date);
        list.add(map4);
        ListView lv = (ListView)findViewById(R.id.list_view1);
        lv.setAdapter(new MyAdapter());
    }
    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = View.inflate(MainActivity.this,R.layout.list_item,null);
            TextView title = (TextView)v.findViewById(R.id.tv_title);
            title.setText((String)list.get(i).get("title"));
            TextView date = (TextView)v.findViewById(R.id.tv_date);
            date.setText((String)list.get(i).get("date"));
            TextView content = (TextView)v.findViewById(R.id.tv_content);
            content.setText((String)list.get(i).get("content"));
            return v;
        }
    }
}
