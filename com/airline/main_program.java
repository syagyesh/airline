package com.airline;

import java.util.Scanner;

public class main_program {
    public static int get_index(){
        Scanner num1 = new Scanner(System.in);
        System.out.println("\nFollowing are the Operation, You can Perform: ");
        System.out.println("**Press 1 for Airline Operation**");
        System.out.println("**Press 2 for Airport Operation**");
        System.out.println("**Press 3 for Flight Operation**");
        System.out.println("**Press 4 for Connecting_flight Operation**");
        System.out.println("**Press 5 for Employee Operation**");
        System.out.println("**Press 6 for Passenger Operation**");
        System.out.println("**Press 7 for Booking Operation**");
        System.out.println("**Press 8 for Cancelling Operation**");
        System.out.println("**Press 9 for Tickets Operation**");
        System.out.println("**Press 0 for Exit **");
        System.out.print("What do you want to perform: ");
        return num1.nextByte();
    }
    public static int get_number(){
        Scanner num = new Scanner(System.in);
            System.out.println("Following are the Actions:");
            System.out.println("**Press 1 for add record**");
            System.out.println("**Press 2 for delete record**");
            System.out.println("**Press 3 for display record**");
            System.out.println("**Press 4 for Search record**");
            System.out.println("**Press 5 for Sort record**");
            System.out.println("**Press 6 for edit record**");
            System.out.println("**Press 0 for return to Main Menu**");
            System.out.print("What do you want to perform: ");
            return num.nextByte();
    }
    public static void main(String[] args) {
        System.out.println("Hey! Welcome to Airline Management System.");
        Scanner o_num = new Scanner(System.in);
        airline[] al = new airline[20];
        airport[] ap = new airport[20];
        booking[] bk = new booking[20];
        cancelling[] cc = new cancelling[20];
        connecting_flight[] cf = new connecting_flight[20];
        employee[] e = new employee[20];
        flight[] f = new flight[20];
        passenger[] p = new passenger[20];
        ticket[] t = new ticket[20];

        // all indexes
        int arl = 0;
        int arp = 0;
        int brk = 0;
        int crc = 0;
        int crf = 0;
        int er = 0;
        int fr = 0;
        int pr = 0;
        int tr = 0;

        // Main Method
        while (true) {
            int n = get_index();
            if (n == 0) {
                System.out.println("Exiting Program...");
                break;
            }
            else {
                switch (n) {
                    case 1 -> {
                        // Airline Operation
                        System.out.println("<-------Airline-------->");
                        while (true) {
                            int id = get_number();
                            if (id == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc = new Scanner(System.in);
                                switch (id) {
                                    case 1 -> {
                                        //add record
                                        al[arl] = new airline();
                                        System.out.println("--------Adding Record to Airline--------");
                                        System.out.print("Enter Airline Code: ");
                                        al[arl].setAR_code(o_num.nextInt());
                                        System.out.print("Enter Airline Name: ");
                                        al[arl].setAR_name(sc.nextLine());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        arl++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Airline--------");
                                        if (al[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Airline Code, You want to delete: ");
                                        int code = o_num.nextInt();
                                        boolean checker = false;
                                        for (int i = 0; i < al.length; i++) {
                                            if (al[i] == null) {
                                                break;
                                            }
                                            if (al[i].getAR_code() == code) {
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< al.length;j++){
                                                    if(al[j] == null){break;}
                                                    al[j] = al[j+1];
                                                }
                                                checker = true;
                                                arl--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Airline--------");
                                        for (airline airline : al) {
                                            if (al[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if(airline == null) {
                                               break;
                                            }
                                            airline.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by binary Search
                                        System.out.println("--------Searching Record from Airline--------");
                                        if (al[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            System.out.print("Enter Airline Code: ");
                                            int arcode = sc.nextInt();
                                            int beg, mid, end, pos=0;
                                            beg = 0;
                                            end = arl-1;
                                            mid = (beg+end)/2;
                                            while(beg<=end){
                                                if(arcode == al[mid].getAR_code()){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(mid+1);
                                                    pos = 1;
                                                    al[mid].display();
                                                    break;
                                                }
                                                else if(arcode < al[mid].getAR_code()){
                                                    end = mid-1;
                                                    mid = (beg+end)/2;
                                                }
                                                else {
                                                    beg = mid+1;
                                                    mid = (beg+end)/2;
                                                }
                                            }
                                            if(pos == 0)
                                            System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Airline--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Airline--------");
                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        // Airport Operation
                        System.out.println("<-------AirPort-------->");
                        while (true) {
                            int apd = get_number();
                            if (apd == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_ap = new Scanner(System.in);
                                switch (apd) {
                                    case 1 -> {
                                        //add record
                                        ap[arp] = new airport();
                                        System.out.println("--------Adding Record to Airport--------");
                                        System.out.print("Enter IATA Code: ");
                                        ap[arp].setIATA_code(sc_ap.nextLine());
                                        System.out.print("Enter Airport Name: ");
                                        ap[arp].setAP_name(sc_ap.nextLine());
                                        System.out.print("Enter Zip Code: ");
                                        ap[arp].setZipcode(sc_ap.nextLine());
                                        System.out.print("Enter City: ");
                                        ap[arp].setCity(sc_ap.nextLine());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        arp++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Airport--------");
                                        if (ap[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the IATA Code, You want to delete: ");
                                        String iata = sc_ap.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < ap.length; i++) {
                                            if (ap[i] == null) {
                                                continue;
                                            }
                                            if (ap[i].getIATA_code().equals(iata)) {
                                                ap[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< ap.length;j++){
                                                    if(ap[j] == null){break;}
                                                    ap[j] = ap[j+1];
                                                }
                                                checker = true;
                                                arp--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Airport--------");
                                        for (airport airport : ap) {
                                            if (ap[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (airport == null) {
                                                break;
                                            }
                                            airport.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record From Airport--------");
                                        if (ap[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter IATA Code: ");
                                            String apcode = sc_ap.nextLine();
                                            for (int i=0; i<ap.length; i++) {
                                                if(ap[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(apcode.equals(ap[i].getIATA_code())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    ap[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record From Airport--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record From Airport--------");
                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 3 -> {
                        //Flight Operation
                        System.out.println("<-------Flights-------->");
                        while (true) {
                            int fd = get_number();
                            if (fd == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_f = new Scanner(System.in);
                                switch (fd) {
                                    case 1 -> {
                                        //add record
                                        f[fr] = new flight();
                                        System.out.println("---------Adding Record to Flights--------");
                                        System.out.print("Enter Flight Code: ");
                                        f[fr].setFlight_code(sc_f.nextLine());
                                        System.out.print("Enter Destination: ");
                                        f[fr].setDestination(sc_f.nextLine());
                                        System.out.print("Enter Source: ");
                                        f[fr].setSource(sc_f.nextLine());
                                        System.out.print("Enter Arrival Time (HH:MM:SS) : ");
                                        f[fr].setArrival(sc_f.nextLine());
                                        System.out.print("Enter Departure Time (HH:MM:SS) : ");
                                        f[fr].setDeparture(sc_f.nextLine());
                                        System.out.print("Enter Journey Type: ");
                                        f[fr].setJourney_type(sc_f.nextLine());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        fr++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Flights--------");
                                        if (f[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Flight Code, You want to delete: ");
                                        String f_code = sc_f.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < f.length; i++) {
                                            if (f[i] == null) {
                                                continue;
                                            }
                                            if (f[i].getFlight_code().equals(f_code)) {
                                                f[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< f.length;j++){
                                                    if(f[j] == null){break;}
                                                    f[j] = f[j+1];
                                                }
                                                checker = true;
                                                fr--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Flights--------");
                                        for (flight flight : f) {
                                            if (f[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (flight == null) {
                                                break;
                                            }
                                            flight.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("---------Searching Record From Flights--------");
                                        if (f[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter Flight Code: ");
                                            String fcode = sc_f.nextLine();
                                            for (int i=0; i<f.length; i++) {
                                                if(f[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(fcode.equals(f[i].getFlight_code())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    f[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("---------Sorting Record From Flights--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("---------Editing Record From Flights--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 4 -> {
                        //Connecting Flight Operation
                        System.out.println("<-------Connecting Flight------->");
                        while (true) {
                            int cfd = get_number();
                            if (cfd == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_cf = new Scanner(System.in);
                                switch (cfd) {
                                    case 1 -> {
                                        //add record
                                        cf[crf] = new connecting_flight();
                                        System.out.println("---------Adding Record to Connecting Flights--------");
                                        System.out.print("Enter Number of Stops: ");
                                        cf[crf].setNo_of_stops(o_num.nextInt());
                                        System.out.print("Enter Stay Time (HH:MM:SS) : ");
                                        cf[crf].setStay_time(sc_cf.nextLine());
                                        System.out.print("Enter Flight Code: ");
                                        cf[crf].setFlight_code(sc_cf.nextLine());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        crf++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Connecting Flights--------");
                                        if (cf[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Flight Code, You want to delete: ");
                                        String cf_code = sc_cf.nextLine();
                                        System.out.print("Write the Number Of Stop of that Flight:  ");
                                        int cf_n = o_num.nextInt();
                                        boolean checker = false;
                                        for (int i = 0; i < cf.length; i++) {
                                            if (cf[i] == null) {
                                                continue;
                                            }
                                            if (cf[i].getFlight_code().equals(cf_code) && cf[i].getNo_of_stops() == cf_n) {
                                                cf[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< cf.length;j++){
                                                    if(cf[j] == null){break;}
                                                    cf[j] = cf[j+1];
                                                }
                                                checker = true;
                                                crf--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Connecting Flights--------");
                                        for (connecting_flight connecting_flight : cf) {
                                            if (cf[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (connecting_flight == null) {
                                                break;
                                            }
                                            connecting_flight.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by lineear search
                                        System.out.println("--------Searching Record from Connecting Flights--------");
                                        if (cf[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter Flight Code: ");
                                            String cfcode = sc_cf.nextLine();
                                            for (int i=0; i<cf.length; i++) {
                                                if(cf[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(cfcode.equals(cf[i].getFlight_code())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    f[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Connecting Flights--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Connecting Flights--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 5 -> {
                        //Employee Operation
                        System.out.println("<-------Employee------->");
                        while (true) {
                            int ed = get_number();
                            if (ed == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_e = new Scanner(System.in);
                                switch (ed) {
                                    case 1 -> {
                                        //add record
                                        e[er] = new employee();
                                        System.out.println("---------Adding Record to Employee--------");
                                        System.out.print("Enter SSN: ");
                                        e[er].setSSN(sc_e.nextLine());
                                        System.out.print("Enter First Name: ");
                                        e[er].setE_fname(sc_e.nextLine());
                                        System.out.print("Enter Last Name: ");
                                        e[er].setE_lname(sc_e.nextLine());
                                        System.out.print("Enter Gender: ");
                                        e[er].setE_gender(sc_e.nextLine());
                                        System.out.print("Enter Mobile Number: ");
                                        e[er].setE_mobile(sc_e.nextLine());
                                        System.out.print("Enter Address: ");
                                        e[er].setE_address(sc_e.nextLine());
                                        System.out.print("Enter City: ");
                                        e[er].setE_city(sc_e.nextLine());
                                        System.out.print("Enter Employee Type: ");
                                        e[er].setE_type(sc_e.nextLine());
                                        System.out.print("Enter Employee Age: ");
                                        e[er].setE_age(o_num.nextInt());
                                        System.out.print("Enter Employee Salary: ");
                                        e[er].setE_salary(o_num.nextInt());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        er++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Employees--------");
                                        if (e[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the SSN Number, You want to delete: ");
                                        String e_code = sc_e.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < e.length; i++) {
                                            if (e[i] == null) {
                                                continue;
                                            }
                                            if (e[i].getSSN().equals(e_code)) {
                                                e[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< e.length;j++){
                                                    if(e[j] == null){break;}
                                                    e[j] = e[j+1];
                                                }
                                                checker = true;
                                                er--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Employees--------");
                                        for (employee employee : e) {
                                            if (e[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (employee == null) {
                                                break;
                                            }
                                            employee.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record from Employee--------");
                                        if (e[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter SSN : ");
                                            String ecode = sc_e.nextLine();
                                            for (int i=0; i<e.length; i++) {
                                                if(e[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(ecode.equals(e[i].getSSN())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    e[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Employee--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Employee--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 6 -> {
                        //Passengers Operation
                        System.out.println("<-------Passenger------->");
                        while (true) {
                            int pd = get_number();
                            if (pd == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_p = new Scanner(System.in);
                                switch (pd) {
                                    case 1 -> {
                                        //add record
                                        p[pr] = new passenger();
                                        System.out.println("---------Adding Record to Passenger--------");
                                        System.out.print("Enter Passport Number: ");
                                        p[pr].setPassport_no(sc_p.nextLine());
                                        System.out.print("Enter First Name: ");
                                        p[pr].setP_fname(sc_p.nextLine());
                                        System.out.print("Enter Last Name: ");
                                        p[pr].setP_lname(sc_p.nextLine());
                                        System.out.print("Enter Gender: ");
                                        p[pr].setP_gender(sc_p.nextLine());
                                        System.out.print("Enter Mobile Number: ");
                                        p[pr].setP_mobile(sc_p.nextLine());
                                        System.out.print("Enter Address: ");
                                        p[pr].setP_address(sc_p.nextLine());
                                        System.out.print("Enter City: ");
                                        p[pr].setP_city(sc_p.nextLine());
                                        System.out.print("Enter Passenger Age: ");
                                        p[pr].setP_age(o_num.nextInt());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        pr++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Passenger--------");
                                        if (p[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Passport Number, You want to delete: ");
                                        String p_code = sc_p.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < p.length; i++) {
                                            if (p[i] == null) {
                                                continue;
                                            }
                                            if (p[i].getPassport_no().equals(p_code)) {
                                                p[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< p.length;j++){
                                                    if(p[j] == null){break;}
                                                    p[j] = p[j+1];
                                                }
                                                checker = true;
                                                pr--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Passenger--------");
                                        for (passenger passenger : p) {
                                            if (p[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (passenger == null) {
                                                break;
                                            }
                                            passenger.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record from Passenger--------");
                                        if (p[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter Passport Number: ");
                                            String pcode = sc_p.nextLine();
                                            for (int i=0; i<p.length; i++) {
                                                if(p[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(pcode.equals(p[i].getPassport_no())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    p[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Passenger--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Passenger--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 7 -> {
                        //Booking Operation
                        System.out.println("<-------Booking------->");
                        while (true) {
                            int bkd = get_number();
                            if (bkd == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_bk = new Scanner(System.in);
                                switch (bkd) {
                                    case 1 -> {
                                        //add record
                                        bk[brk] = new booking();
                                        System.out.println("---------Adding Record to Booking--------");
                                        System.out.print("Enter Book ID: ");
                                        bk[brk].setBook_id(sc_bk.nextLine());
                                        System.out.print("Enter Book Date (YYYY/MM/DD) : ");
                                        bk[brk].setBook_date(sc_bk.nextLine());
                                        System.out.print("Enter Flight Status: ");
                                        bk[brk].setStatus(sc_bk.nextLine());
                                        System.out.print("Enter Number Of Tickets: ");
                                        bk[brk].setNo_of_tickets(o_num.nextInt());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        brk++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Booking--------");
                                        if (bk[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Book ID, You want to delete: ");
                                        String bk_code = sc_bk.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < bk.length; i++) {
                                            if (bk[i] == null) {
                                                continue;
                                            }
                                            if (bk[i].getBook_id().equals(bk_code)) {
                                                bk[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< bk.length;j++){
                                                    if(bk[j] == null){break;}
                                                    bk[j] = bk[j+1];
                                                }
                                                checker = true;
                                                brk--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Booking--------");
                                        for (booking booking : bk) {
                                            if (bk[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (booking == null) {
                                                break;
                                            }
                                            booking.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record from Booking--------");
                                        if (bk[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter Book ID: ");
                                            String bcode = sc_bk.nextLine();
                                            for (int i=0; i<bk.length; i++) {
                                                if(bk[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(bcode.equals(bk[i].getBook_id())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    bk[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Booking--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Booking--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 8 -> {
                        //Cancelling Operation
                        System.out.println("<-------Cancelling------->");
                        while (true) {
                            int ccd = get_number();
                            if (ccd == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_cc = new Scanner(System.in);
                                switch (ccd) {
                                    case 1 -> {
                                        //add record
                                        cc[crc] = new cancelling();
                                        System.out.println("---------Adding Record to Cancelling--------");
                                        System.out.print("Enter Cancel ID: ");
                                        cc[crc].setCancel_id(sc_cc.nextLine());
                                        System.out.print("Enter Cancel Date (YYYY/MM/DD) : ");
                                        cc[crc].setCancel_date(sc_cc.nextLine());
                                        System.out.print("Enter Book ID: ");
                                        cc[crc].setBook_id(sc_cc.nextLine());
                                        System.out.print("Enter Surcharge: ");
                                        cc[crc].setSurcharge(o_num.nextInt());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        crc++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Cancelling--------");
                                        if (cc[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Cancel ID, You want to delete: ");
                                        String cc_code = sc_cc.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < cc.length; i++) {
                                            if (cc[i] == null) {
                                                continue;
                                            }
                                            if (cc[i].getCancel_date().equals(cc_code)) {
                                                cc[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< cc.length;j++){
                                                    if(cc[j] == null){break;}
                                                    cc[j] = cc[j+1];
                                                }
                                                checker = true;
                                                crc--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Cancelling--------");
                                        for (cancelling cancelling : cc) {
                                            if (cc[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (cancelling == null) {
                                                break;
                                            }
                                            cancelling.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record from Cancelling--------");
                                        if (cc[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter Cancel ID: ");
                                            String ccode = sc_cc.nextLine();
                                            for (int i=0; i<cc.length; i++) {
                                                if(cc[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(ccode.equals(cc[i].getCancel_id())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    cc[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Cancelling--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Cancelling--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    case 9 -> {
                        //Tickets Operation
                        System.out.println("<-------Ticket------->");
                        while (true) {
                            int td = get_number();
                            if (td == 0) {
                                System.out.println("Exiting Operation...");
                                break;
                            } else {
                                Scanner sc_t = new Scanner(System.in);
                                switch (td) {
                                    case 1 -> {
                                        //add record
                                        t[tr] = new ticket();
                                        System.out.println("---------Adding Record to Ticket--------");
                                        System.out.print("Enter Ticket Number: ");
                                        t[tr].setT_number(sc_t.nextLine());
                                        System.out.print("Enter Class: ");
                                        t[tr].setClass(sc_t.nextLine());
                                        System.out.print("Enter Passport No: ");
                                        t[tr].setPassport_no(sc_t.nextLine());
                                        System.out.print("Enter Travel Date (YYYY/MM/DD) : ");
                                        t[tr].setTravel_date(sc_t.nextLine());
                                        System.out.print("Enter Flight Code: ");
                                        t[tr].setFlight_code(sc_t.nextLine());
                                        System.out.print("Enter Seat Number: ");
                                        t[tr].setSeat_no(o_num.nextInt());
                                        System.out.print("Enter Price: ");
                                        t[tr].setPrice(o_num.nextInt());
                                        System.out.print("Enter Airline Code: ");
                                        t[tr].setAR_code(o_num.nextInt());
                                        System.out.println("---------------** SuccessFully Entered **-----------------");
                                        tr++;
                                    }
                                    case 2 -> {
                                        //delete record
                                        System.out.println("--------Deleting Record from Ticket--------");
                                        if (t[0] == null) {
                                            System.out.println("...No Data Present to delete...");
                                            break;
                                        }
                                        System.out.print("Write the Ticket Number, You want to delete: ");
                                        String t_code = sc_t.nextLine();
                                        boolean checker = false;
                                        for (int i = 0; i < t.length; i++) {
                                            if (t[i] == null) {
                                                continue;
                                            }
                                            if (t[i].getT_number().equals(t_code)) {
                                                t[i] = null;
                                                System.out.println("Record Deleted.");
                                                for (int j = i;j< t.length;j++){
                                                    if(t[j] == null){break;}
                                                    t[j] = t[j+1];
                                                }
                                                checker = true;
                                                tr--;
                                            }
                                            if (checker) {
                                                break;
                                            }
                                        }
                                        if (!checker) {
                                            System.out.print("The given record is not in data. Try Again By Choosing Operation:  ");
                                        }
                                    }
                                    case 3 -> {
                                        //display record
                                        System.out.println("--------Displaying Record from Ticket--------");
                                        for (ticket ticket : t) {
                                            if (t[0] == null) {
                                                System.out.println("...No Data Present in Record...");
                                                break;
                                            }
                                            if (ticket == null) {
                                                break;
                                            }
                                            ticket.display();
                                            System.out.println("---------------------------------------------------");
                                        }
                                    }
                                    case 4 -> {
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record from Ticket--------");
                                        if (t[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            int pos=0;
                                            System.out.print("Enter Ticket Number: ");
                                            String tcode = sc_t.nextLine();
                                            for (int i=0; i<t.length; i++) {
                                                if(t[i] == null){
                                                    System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                                    pos=1;
                                                    break;
                                                }
                                                if(tcode.equals(t[i].getT_number())){
                                                    System.out.println("---------- RECORD FOUND --------------");
                                                    System.out.print("Record Position is : ");
                                                    System.out.println(i+1);
                                                    t[i].display();
                                                    pos=1;
                                                    break;
                                                }
                                            }
                                            if(pos == 0){
                                                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Ticket--------");

                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Ticket--------");

                                    }
                                    default -> System.out.println("Try Again With Correct Input...");
                                }
                            }
                        }
                    }
                    default -> System.out.println("Try Again With Correct Input: ");
                }
                System.out.print("Enter Again for Another Operation:");
            }
        }
    }
}