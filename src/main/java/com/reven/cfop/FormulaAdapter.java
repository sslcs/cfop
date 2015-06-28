package com.reven.cfop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Reven on 2015/6/28.
 * Formula Adapter
 */
public class FormulaAdapter extends RecyclerView.Adapter<FormulaAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<Integer> mImages;
    private ArrayList<String> mSteps;

    public FormulaAdapter(Context context,ArrayList<Integer> images,ArrayList<String> steps) {
        mContext = context;
        mImages = images;
        mSteps = steps;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.ivStep.setImageResource(mImages.get(position));
        String step = (position + 1) + "：  " + mSteps.get(position);
        viewHolder.tvStep.setText(Html.fromHtml(step));
    }

    @Override
    public int getItemCount() {
        return mSteps == null ? 0 : mSteps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivStep;
        private TextView tvStep;

        public ViewHolder(View itemView) {
            super(itemView);
            ivStep = (ImageView) itemView.findViewById(R.id.iv_step);
            tvStep = (TextView) itemView.findViewById(R.id.tv_step);
        }
    }
}
