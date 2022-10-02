package com.airline;

public class passenger {
    String Passport_no, P_fname, P_lname, P_gender, P_address, P_mobile, P_city;
    int P_age;

    public String getPassport_no() {
        return Passport_no;
    }

    public void setPassport_no(String passport_no) {
        Passport_no = passport_no;
    }

    public String getP_fname() {
        return P_fname;
    }

    public void setP_fname(String p_fname) {
        P_fname = p_fname;
    }

    public String getP_lname() {
        return P_lname;
    }

    public void setP_lname(String p_lname) {
        P_lname = p_lname;
    }

    public String getP_gender() {
        return P_gender;
    }

    public void setP_gender(String p_gender) {
        P_gender = p_gender;
    }

    public String getP_address() {
        return P_address;
    }

    public void setP_address(String p_address) {
        P_address = p_address;
    }

    public String getP_mobile() {
        return P_mobile;
    }

    public void setP_mobile(String p_mobile) {
        P_mobile = p_mobile;
    }

    public String getP_city() {
        return P_city;
    }

    public void setP_city(String p_city) {
        P_city = p_city;
    }

    public int getP_age() {
        return P_age;
    }

    public void setP_age(int p_age) {
        P_age = p_age;
    }
    public void display(){
        System.out.println("Passport Number: "+Passport_no);
        System.out.println("Passenger first name: "+P_fname);
        System.out.println("Passenger last name: "+ P_lname);
        System.out.println("Passenger Gender: "+P_gender);
        System.out.println("Passenger Mobile No. : "+ P_mobile);
        System.out.println("Passenger Address: "+P_address);
        System.out.println("Passenger age: "+P_age);
        System.out.println("Passenger City: "+P_city);
    }
}
