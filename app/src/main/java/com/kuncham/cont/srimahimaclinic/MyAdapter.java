package com.kuncham.cont.srimahimaclinic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by abc on 2/27/2018.
 */

class MyAdapter extends BaseAdapter{

    Context ct;
    List<Appointment> list;
    MyAdapter(Context ct,List<Appointment> list){

        this.ct=ct;
        this.list=list;

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = li.inflate(R.layout.list, null);


        return v;
    }
}
