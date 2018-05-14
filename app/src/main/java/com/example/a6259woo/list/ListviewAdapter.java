package com.example.a6259woo.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 6259woo on 2018. 5. 14..
 */

public class ListviewAdapter extends BaseAdapter {
    ArrayList<Listviewitem> listviewitems = new ArrayList<Listviewitem>();
    @Override
    public int getCount() {
        return listviewitems.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item,parent,false);
            ImageView imageView = convertView.findViewById(R.id.icon);
            TextView name = convertView.findViewById(R.id.name);
            TextView artist = convertView.findViewById(R.id.artist);

            Listviewitem listviewitem = listviewitems.get(position);
            imageView.setImageDrawable(listviewitem.getImgage());
            name.setText(listviewitem.getName());
            artist.setText(listviewitem.getArtist());

            Log.e("ADSf", "adsf");

            return convertView;
        }
        return null;
    }

    public void addItem(Drawable image, String name, String artist){
        Listviewitem item = new Listviewitem();
        item.setArtist(artist);
        item.setName(name);
        item.setImgage(image);

        listviewitems.add(item);
    }
}
