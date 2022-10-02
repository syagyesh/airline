package com.airline;

public class flight {
    String flight_code, destination, source, arrival, departure, journey_type;

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getJourney_type() {
        return journey_type;
    }

    public void setJourney_type(String journey_type) {
        this.journey_type = journey_type;
    }
    public void display(){
        System.out.println("Flight Code: "+flight_code);
        System.out.println("Destination: "+destination);
        System.out.println("Source: "+source);
        System.out.println("Arrival Time: "+arrival);
        System.out.println("Departure Time: "+departure);
        System.out.println("Journey Type: "+journey_type);
    }
}
