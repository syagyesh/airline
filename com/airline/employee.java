package com.airline;

public class employee {
    String SSN, E_fname, E_lname, E_gender,E_mobile, E_address, E_city, E_type;
    int E_age, E_salary;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getE_fname() {
        return E_fname;
    }

    public void setE_fname(String e_fname) {
        E_fname = e_fname;
    }

    public String getE_lname() {
        return E_lname;
    }

    public void setE_lname(String e_lname) {
        E_lname = e_lname;
    }

    public String getE_gender() {
        return E_gender;
    }

    public void setE_gender(String e_gender) {
        E_gender = e_gender;
    }

    public String getE_mobile() {
        return E_mobile;
    }

    public void setE_mobile(String e_mobile) {
        E_mobile = e_mobile;
    }

    public String getE_address() {
        return E_address;
    }

    public void setE_address(String e_address) {
        E_address = e_address;
    }

    public String getE_city() {
        return E_city;
    }

    public void setE_city(String e_city) {
        E_city = e_city;
    }

    public String getE_type() {
        return E_type;
    }

    public void setE_type(String e_type) {
        E_type = e_type;
    }

    public int getE_age() {
        return E_age;
    }

    public void setE_age(int e_age) {
        E_age = e_age;
    }

    public int getE_salary() {
        return E_salary;
    }

    public void setE_salary(int e_salary) {
        E_salary = e_salary;
    }
    public void display(){
        System.out.println("Employee SSN number: "+SSN);
        System.out.println("Employee first name: "+E_fname);
        System.out.println("Employee last name: "+ E_lname);
        System.out.println("Employee Gender: "+E_gender);
        System.out.println("Employee Mobile No. : "+ E_mobile);
        System.out.println("Employee Address: "+E_address);
        System.out.println("Employee City: "+E_city);
        System.out.println("Employee Type: "+E_type);
        System.out.println("Employee age: "+E_age);
        System.out.println("Employee Salary: "+E_salary);
    }
}
