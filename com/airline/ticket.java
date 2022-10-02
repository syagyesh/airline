package com.airline;

public class ticket {
    String t_number, Clas, Passport_no, travel_date, flight_code;
    int seat_no, price, AR_code;

    public String getT_number() {
        return t_number;
    }

    public void setT_number(String t_number) {
        this.t_number = t_number;
    }

    public String getClas() {
        return Clas;
    }

    public void setClass(String aClass) {
        Clas = aClass;
    }

    public String getPassport_no() {
        return Passport_no;
    }

    public void setPassport_no(String passport_no) {
        Passport_no = passport_no;
    }

    public String getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(String travel_date) {
        this.travel_date = travel_date;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAR_code() {
        return AR_code;
    }

    public void setAR_code(int AR_code) {
        this.AR_code = AR_code;
    }
    public void display(){
        System.out.println("Ticket Number: "+t_number);
        System.out.println("Class: "+Clas);
        System.out.println("Passport Number: "+Passport_no);
        System.out.println("Travel Date: "+travel_date);
        System.out.println("Flight Code: "+flight_code);
        System.out.println("Seat Number: "+seat_no);
        System.out.println("Price: "+price);
        System.out.println("Airline Code: "+AR_code);
    }
}
