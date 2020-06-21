package com.unibz.prototype.model;

import java.util.Date;

public class Plan {
    /*
    * Class that represents both a Trip Plan, both a Stop Plan
    * */
    private Date startDay;
    private Date startHour;
    private String departureCity;
    private String ArrivalCity;

    /* Getters and Setters*/
    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getStartHour() {
        return startHour;
    }

    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return ArrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        ArrivalCity = arrivalCity;
    }





}
