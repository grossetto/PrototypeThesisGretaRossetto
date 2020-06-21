package com.unibz.prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.unibz.prototype.model.Act;
import com.unibz.prototype.model.ActivitiesAdapter;
import com.unibz.prototype.model.Prediction;

import java.util.ArrayList;

public class PredictionResult extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Act> activities;
    Prediction prediction;

    ActivitiesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_result);

        prediction = new Prediction();

        recyclerView = findViewById(R.id.activitiesRecyclerView);
        activities = new ArrayList<>();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);
        mAdapter = new ActivitiesAdapter(prediction.getActivities());

        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}