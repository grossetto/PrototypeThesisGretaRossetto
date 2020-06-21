package com.unibz.prototype.model;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.unibz.prototype.R;

import java.text.SimpleDateFormat;


public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.CustomViewHolder> {
    private List<Act> activitiesDetails;



    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView activityNameView, consumptionView, timeView;

        public CustomViewHolder(View view) {
            super(view);
            activityNameView = view.findViewById(R.id.activityName);
            consumptionView = view.findViewById(R.id.activityConsumption);
            timeView = view.findViewById(R.id.activityTime);

        }

    }

    public ActivitiesAdapter(List<Act> activitiesDetails) {
        this.activitiesDetails = activitiesDetails;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.act_list, parent, false);


        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        SimpleDateFormat dateFormatD = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatT = new SimpleDateFormat("h:mm a");
        Act activityDetail = activitiesDetails.get(position);
        holder.activityNameView.setText(activityDetail.getName());
        holder.consumptionView.setText(String.valueOf(activityDetail.getConsumption()));
        holder.timeView.setText(String.valueOf(activityDetail.getTime()));
    }

    @Override
    public int getItemCount() {
        return activitiesDetails.size();
    }}