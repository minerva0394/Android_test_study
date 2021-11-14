package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] titles = {"桌子", "苹果", "蛋糕", "线衣", "猕猴桃", "围巾"};

    private String[] prices = {"1800元", "10元/kg", "300元", "350元", "10元/kg", "280"};

    private int[] icons = {R.drawable.table, R.drawable.apple, R.drawable.cake, R.drawable.wireclothes,
            R.drawable.kiwifruit, R.drawable.scarf};

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        mListView = (ListView) findViewById(R.id.lv);
        MyBaseAdapter mAdapter = new MyBaseAdapter();
        mListView.setAdapter(mAdapter);
    }

    class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int i) {
            return titles[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view1, ViewGroup viewGroup) {
            View view = View.inflate(MainActivity.this, R.layout.listltem, null);
            TextView title = view.findViewById(R.id.title);
            TextView price = view.findViewById(R.id.price);
            ImageView iv = view.findViewById(R.id.iv);
            title.setText(titles[i]);
            price.setText(prices[i]);
            iv.setBackgroundResource(icons[i]);

            return view;
        }
    }

}