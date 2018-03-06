package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer[] mThumbIds = new Integer[]{Integer.valueOf(C0127R.drawable.sjvn_logo), Integer.valueOf(C0127R.drawable.sbi), Integer.valueOf(C0127R.drawable.photon), Integer.valueOf(C0127R.drawable.lic), Integer.valueOf(C0127R.drawable.him), Integer.valueOf(C0127R.drawable.daily), Integer.valueOf(C0127R.drawable.uraj), Integer.valueOf(C0127R.drawable.ibs), Integer.valueOf(C0127R.drawable.jogi)};

    public ImageAdapter(Context c) {
        this.mContext = c;
    }

    public int getCount() {
        return this.mThumbIds.length;
    }

    public Object getItem(int position) {
        return this.mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(this.mContext);
        imageView.setImageResource(this.mThumbIds[position].intValue());
        imageView.setScaleType(ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new LayoutParams(70, 70));
        return imageView;
    }
}
