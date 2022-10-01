package com.airline;


public class airline {
    public int AR_code;
    String AR_name;

    public int getAR_code() {
        return AR_code;
    }

    public void setAR_code(int AR_code) {
        this.AR_code = AR_code;
    }

    public String getAR_name() {
        return AR_name;
    }

    public void setAR_name(String AR_name) {
        this.AR_name = AR_name;
    }
    public void display(){
        System.out.println("Airline Code: "+ AR_code);
        System.out.println("Airline Name: "+ AR_name);
    }
}