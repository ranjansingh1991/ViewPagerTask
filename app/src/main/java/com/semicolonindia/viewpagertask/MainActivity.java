package com.semicolonindia.viewpagertask;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.semicolonindia.viewpagertask.Adapter.CustomAdapterRecycle;
import com.semicolonindia.viewpagertask.Adapter.CustomSwipeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    RecyclerView mRecyclerView;
    GridLayoutManager gridLayoutManager;

    CustomSwipeAdapter adapter;
    CustomAdapterRecycle recycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        // ViewPager
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        // set Adapter
        adapter = new CustomSwipeAdapter(getApplicationContext());
        viewPager.setAdapter(adapter);
        //
        List<Pojo> listItem = getAllItems();
        // Set your Grid Layout
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        // RecyclerView
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        // size argesment
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        recycleAdapter = new CustomAdapterRecycle(getApplicationContext(),listItem);
        mRecyclerView.setAdapter(recycleAdapter);
    }




    private List<Pojo> getAllItems(){
        List<Pojo> list = new ArrayList<>();
        list.add(new Pojo(R.drawable.sample_0, "First"));
        list.add(new Pojo(R.drawable.sample_1, "Second"));
        list.add(new Pojo(R.drawable.sample_2, "Third"));
        list.add(new Pojo(R.drawable.sample_3, "Fourth"));
        list.add(new Pojo(R.drawable.sample_4, "Fifth"));
        list.add(new Pojo(R.drawable.sample_5, "Sixth"));
        list.add(new Pojo(R.drawable.sample_6, "Seventh"));
        list.add(new Pojo(R.drawable.sample_0, "Eighth"));

        return list;
    }
}
