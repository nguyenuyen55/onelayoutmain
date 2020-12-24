package com.example.bailam;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdaper extends BaseAdapter {
    int[] hinh;
    String[] tieude;
    String[] cuthee;
    Context context;

    public GridViewAdaper(int[] hinh, String[] tieude, String[] cuthe, Context context) {
        this.hinh = hinh;
        this.tieude = tieude;
        this.cuthee = cuthe;
        this.context = context;
    }

    @Override
    public int getCount() {
        return tieude.length;
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
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.row_gird,null);
        ImageView imageView=convertView.findViewById(R.id.anh);
        TextView cuthe=convertView.findViewById(R.id.cuthe);
        TextView tieude1=convertView.findViewById(R.id.tieude);

        imageView.setImageResource(hinh[position]);
        cuthe.setText(cuthee[position]);
        tieude1.setText(tieude[position]);

        return convertView;
    }
}
