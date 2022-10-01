package com.airline;

public class airport {
    String IATA_code;
    String AP_name;
    String zipcode;
    String city;

    public String getIATA_code() {
        return IATA_code;
    }

    public String getAP_name() {
        return AP_name;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setIATA_code(String IATA_code) {
        this.IATA_code = IATA_code;
    }

    public void setAP_name(String AP_name) {
        this.AP_name = AP_name;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("IATA Code: "+ IATA_code);
        System.out.println("Airport Name: "+ AP_name);
        System.out.println("Zip Code: "+ zipcode);
        System.out.println("City: "+ city);
    }
}



