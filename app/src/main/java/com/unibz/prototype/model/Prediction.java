package com.unibz.prototype.model;

import androidx.lifecycle.LiveData;

import java.util.ArrayList;

public class Prediction extends LiveData<Prediction> {

    private ArrayList<Act> activities;
    private Model model;

    public ArrayList<Act> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Act> activities) {
        this.activities = activities;
    }

    public Prediction () {
        this.initializeActivitiesList();
    }
    public void initializeActivitiesList () {
        activities = new ArrayList<Act>();

        activities.add(new Act("TV", 7, 60));
        activities.add(new Act("COOKING", 5, 60));
        activities.add(new Act("DINETTE", 10, 60));

    }

}
