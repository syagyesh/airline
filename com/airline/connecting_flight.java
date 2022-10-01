package com.airline;

public class connecting_flight {
    int no_of_stops;
    String stay_time, flight_code;

    public int getNo_of_stops() {
        return no_of_stops;
    }

    public void setNo_of_stops(int no_of_stops) {
        this.no_of_stops = no_of_stops;
    }

    public String getStay_time() {
        return stay_time;
    }

    public void setStay_time(String stay_time) {
        this.stay_time = stay_time;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }
    public void display(){
        System.out.println("Number of Stops: "+ no_of_stops);
        System.out.println("Stay Time: "+stay_time);
        System.out.println("Flight Code: "+ flight_code);
    }
}
