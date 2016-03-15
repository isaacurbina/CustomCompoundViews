package com.mobileappsco.training.customviewapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by admin on 3/15/2016.
 */
public class MyCompoundView extends RelativeLayout {

    String name;
    Bitmap photo;
    ImageView imageView;
    TextView textView;

    public MyCompoundView(Context context) {
        super(context);
        init();
    }

    public MyCompoundView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {
        LayoutInflater mInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = (View) mInflater.inflate(R.layout.view_compound, this);
        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void setCompoundView(String text, int id) {
        Bitmap bitmap  = BitmapFactory.decodeResource(getResources(), R.mipmap.badtoro);
        imageView.setImageBitmap(bitmap);
        textView.setText(text);
    }

}
