package com.example.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderViewHolder> {

    private int[] images;
    private String[] texts1;
    private String[] texts2;

    public SliderAdapter(int[] images, String[] texts1, String[] texts2) {
        this.images = images;
        this.texts1 = texts1;
        this.texts2 = texts2;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, null);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.textView1.setText(texts1[position]);
        viewHolder.textView2.setText(texts2[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class SliderViewHolder extends  SliderViewAdapter.ViewHolder{

        private ImageView imageView;
        private TextView textView1, textView2;

        public SliderViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
        }
    }
}
