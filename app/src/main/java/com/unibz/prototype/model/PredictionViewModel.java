package com.unibz.prototype.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class PredictionViewModel extends ViewModel {
    LiveData<Prediction> predictionLiveData;

    public PredictionViewModel(@NonNull Application application) {

        super();
        predictionLiveData = new Prediction();
    }

    public LiveData<Prediction> getPredictionLiveData(){
        return predictionLiveData;
    }

}
