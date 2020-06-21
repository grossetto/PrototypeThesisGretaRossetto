package com.unibz.prototype.model;

public class Act {

    private String name;
    private double consumption;
    private double time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Act(String name, double consumption, double time){
        this.name = name;
        this.consumption = consumption;
        this.time = time;
    }



}
