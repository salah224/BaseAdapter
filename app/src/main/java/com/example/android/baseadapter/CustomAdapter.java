package com.example.android.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by salah on 6/5/2017.
 */


public class CustomAdapter extends BaseAdapter {
    Context context;
    int animals[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int[] animals) {
        this.context = applicationContext;
        this.animals = animals;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return animals.length;
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
        view = inflter.inflate(R.layout.activity_gridview, null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(animals[i]);
        return view;
    }
}
