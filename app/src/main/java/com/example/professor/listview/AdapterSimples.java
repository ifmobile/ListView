package com.example.professor.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterSimples extends BaseAdapter {

    private Context context;
    private String[] planetas = new String[]{"Mercúrio","Vênus","Terra",
            "Marte","Júpiter","Saturno","Urano","Netuno"};

    public AdapterSimples(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return planetas.length;
    }

    @Override
    public Object getItem(int position) {
        return planetas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String planeta = planetas[position];
        View view = LayoutInflater.from(context)
                .inflate(R.layout.adapter_simples,parent,false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(planeta);

        return view;
    }
}
