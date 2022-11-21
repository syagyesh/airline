package com.airline;

import java.util.Scanner;

public class main_program {
    public static void main(String[] args) {
        System.out.println("\n\nHey! Welcome to Airline Management System.\n");
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
        allfunction func = new allfunction();

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
            int n = func.get_index();
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
                            int id = func.get_number();
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
                                        if (al[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Write the Airline Code, You want to delete: ");
                                            int alcode = o_num.nextInt();
                                            int posAl = func.binary_Search_num(al, arl-1, alcode);
                                            if(posAl > 0) {
                                                System.out.println("Record Deleted.");
                                                for (int j = posAl-1; j < arl; j++) {
                                                    al[j] = al[j+1];
                                                }
                                                arl--;
                                            }
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
                                        if (al[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Airline Code: ");
                                            int alcode = o_num.nextInt();
                                            int posAl = func.binary_Search_num(al, arl-1, alcode);
                                            if(posAl > 0) {
                                                System.out.println("Record position is: " + posAl);
                                                al[posAl-1].display();
                                            }  
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Airline--------");
                                        func.quickSortNum(al, 0, arl-1);
                                        System.out.println("--------Sorted Record to Airline--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Airline--------");
                                        if (al[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.println("Enter the Airline Code you want to edit: ");
                                            int arlcode = sc.nextInt();
                                            int posofAl = func.binary_Search_num(al,arl-1,arlcode);
                                            if(posofAl > 0) {
                                                System.out.print("Enter Airline Name: ");
                                                al[posofAl-1].setAR_name(sc.nextLine());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            } 
                                        }
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
                            int apd = func.get_number();
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
                                        if (ap[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Write the IATA Code, You want to delete: ");
                                            String apcode = o_num.nextLine();
                                            int posAp = func.binary_Search_AP(ap, arp-1, apcode);
                                            if(posAp > 0) {
                                                System.out.println("Record Deleted.");
                                                for (int j = posAp-1; j < arp; j++) {
                                                    ap[j] = ap[j+1];
                                                }
                                                arp--;
                                            }
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
                                        //Search Record by binary search
                                        System.out.println("--------Searching Record From Airport--------");
                                        if (ap[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter IATA Code: ");
                                            String apcode = o_num.nextLine();
                                            int posAp = func.binary_Search_AP(ap, arp-1, apcode);
                                            if(posAp > 0) {
                                                System.out.println("Record position is: " + posAp);
                                                ap[posAp-1].display();
                                            } 
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record From Airport--------");
                                        func.quickSortStrAP(ap, 0, arp-1);
                                        System.out.println("--------Sorted Record to Airport--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record From Airport--------");
                                        if (ap[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter IATA Code: ");
                                            String arpcode = sc_ap.nextLine();
                                            int posofAp = func.binary_Search_AP(ap,arp-1,arpcode);
                                            if(posofAp > 0) {
                                                System.out.print("Enter Airport Name: ");
                                                ap[posofAp-1].setAP_name(sc_ap.nextLine());
                                                System.out.print("Enter Zip Code: ");
                                                ap[posofAp-1].setZipcode(sc_ap.nextLine());
                                                System.out.print("Enter City: ");
                                                ap[posofAp-1].setCity(sc_ap.nextLine());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            } 
                                        }
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
                            int fd = func.get_number();
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
                                        int posF = func.binary_Search_F(f, fr-1, f_code);
                                        if(posF > 0) {
                                            System.out.println("Record Deleted.");
                                            for (int j = posF-1; j < fr; j++) {
                                                f[j] = f[j+1];
                                            }
                                            fr--;
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
                                        //Search Record by binary search
                                        System.out.println("---------Searching Record From Flights--------");
                                        if (f[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Flight Code: ");
                                            String fcode = sc_f.nextLine();
                                            int posF = func.binary_Search_F(f, fr-1, fcode);
                                            if(posF > 0) {
                                                System.out.println("Record position is: " + posF);
                                                f[posF-1].display();
                                            } 
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("---------Sorting Record From Flights--------");
                                        func.quickSortStrF(f, 0, fr-1);
                                        System.out.println("--------Sorted Record to Flights--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("---------Editing Record From Flights--------");
                                        if (f[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Flight Code: ");
                                            String frcode = sc_f.nextLine();
                                            int posofF = func.binary_Search_F(f,fr-1,frcode);
                                            if(posofF > 0) {
                                                System.out.print("Enter Destination: ");
                                                f[posofF-1].setDestination(sc_f.nextLine());
                                                System.out.print("Enter Source: ");
                                                f[posofF-1].setSource(sc_f.nextLine());
                                                System.out.print("Enter Arrival Time (HH:MM:SS) : ");
                                                f[posofF-1].setArrival(sc_f.nextLine());
                                                System.out.print("Enter Departure Time (HH:MM:SS) : ");
                                                f[posofF-1].setDeparture(sc_f.nextLine());
                                                System.out.print("Enter Journey Type: ");
                                                f[posofF-1].setJourney_type(sc_f.nextLine());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            } 
                                        }
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
                            int cfd = func.get_number();
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
                                        //Search Record by linear search
                                        System.out.println("--------Searching Record from Connecting Flights--------");
                                        System.out.print("Enter Flight Code: ");
                                        String cfcode = sc_cf.nextLine();
                                        int posCf = func.binary_Search_CF(cf, crf-1, cfcode);
                                        if(posCf > 0) {
                                            System.out.println("Record position is: " + posCf);
                                            cf[posCf-1].display();    
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Connecting Flights--------");
                                        func.quickSortStrCF(cf, 0, crf-1);
                                        System.out.println("--------Sorted Record to Connecting Flights--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Connecting Flights--------");
                                        if (f[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Flight Code: ");
                                            String cfcode = sc_cf.nextLine();
                                            int posofCf = func.binary_Search_CF(cf,crf-1,cfcode);
                                            if(posofCf > 0) {
                                                System.out.print("Enter Number of Stops: ");
                                                cf[posofCf-1].setNo_of_stops(o_num.nextInt());
                                                System.out.print("Enter Stay Time (HH:MM:SS) : ");
                                                cf[posofCf-1].setStay_time(sc_cf.nextLine());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            }
                                        }
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
                            int ed = func.get_number();
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
                                        int posE = func.binary_Search_EE(e, er-1, e_code);
                                        if(posE > 0) {
                                            System.out.println("Record Deleted.");
                                            for (int j = posE-1; j < er; j++) {
                                                e[j] = e[j+1];
                                            }
                                            er--;
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
                                        //Search Record by binary search
                                        System.out.println("--------Searching Record from Employee--------");
                                        if (e[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            System.out.print("Enter SSN : ");
                                            String ecode = sc_e.nextLine();
                                            int posE = func.binary_Search_EE(e, er-1, ecode);
                                            if(posE > 0) {
                                                System.out.println("Record position is: " + posE);
                                                e[posE-1].display();
                                            } 
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Employee--------");
                                        func.quickSortStrEE(e, 0, er-1);
                                        System.out.println("--------Sorted Record to Employee--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Employee--------");
                                        if (e[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter SSN: ");
                                            String ecode = sc_e.nextLine();
                                            int posofE = func.binary_Search_EE(e,er-1,ecode);
                                            if(posofE > 0) {
                                                System.out.print("Enter First Name: ");
                                                e[posofE-1].setE_fname(sc_e.nextLine());
                                                System.out.print("Enter Last Name: ");
                                                e[posofE-1].setE_lname(sc_e.nextLine());
                                                System.out.print("Enter Gender: ");
                                                e[posofE-1].setE_gender(sc_e.nextLine());
                                                System.out.print("Enter Mobile Number: ");
                                                e[posofE-1].setE_mobile(sc_e.nextLine());
                                                System.out.print("Enter Address: ");
                                                e[posofE-1].setE_address(sc_e.nextLine());
                                                System.out.print("Enter City: ");
                                                e[posofE-1].setE_city(sc_e.nextLine());
                                                System.out.print("Enter Employee Type: ");
                                                e[posofE-1].setE_type(sc_e.nextLine());
                                                System.out.print("Enter Employee Age: ");
                                                e[posofE-1].setE_age(o_num.nextInt());
                                                System.out.print("Enter Employee Salary: ");
                                                e[posofE-1].setE_salary(o_num.nextInt());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            }
                                        }
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
                            int pd = func.get_number();
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
                                        int posP = func.binary_Search_P(p, pr-1, p_code);
                                        if(posP > 0) {
                                            System.out.println("Record Deleted.");
                                            for (int j = posP-1; j < pr; j++) {
                                                p[j] = p[j+1];
                                            }
                                            pr--;
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
                                        //Search Record by binary search
                                        System.out.println("--------Searching Record from Passenger--------");
                                        if (p[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            System.out.print("Enter Passport Number: ");
                                            String pcode = sc_p.nextLine();
                                            int posP = func.binary_Search_P(p, pr-1, pcode);
                                            if(posP > 0) {
                                                System.out.println("Record position is: " + posP);
                                                p[posP-1].display();
                                            } 
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Passenger--------");
                                        func.quickSortStrP(p, 0, pr-1);
                                        System.out.println("--------Sorted Record to Passenger--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Passenger--------");
                                        if (p[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Passport Number: ");
                                            String pcode = sc_p.nextLine();
                                            int posofP = func.binary_Search_P(p,pr-1,pcode);
                                            if(posofP > 0) {
                                                System.out.print("Enter First Name: ");
                                                p[posofP-1].setP_fname(sc_p.nextLine());
                                                System.out.print("Enter Last Name: ");
                                                p[posofP-1].setP_lname(sc_p.nextLine());
                                                System.out.print("Enter Gender: ");
                                                p[posofP-1].setP_gender(sc_p.nextLine());
                                                System.out.print("Enter Mobile Number: ");
                                                p[posofP-1].setP_mobile(sc_p.nextLine());
                                                System.out.print("Enter Address: ");
                                                p[posofP-1].setP_address(sc_p.nextLine());
                                                System.out.print("Enter City: ");
                                                p[posofP-1].setP_city(sc_p.nextLine());
                                                System.out.print("Enter Passenger Age: ");
                                                p[posofP-1].setP_age(o_num.nextInt());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            }
                                        }
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
                            int bkd = func.get_number();
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
                                        int posBk = func.binary_Search_BK(bk, brk-1, bk_code);
                                        if(posBk > 0) {
                                            System.out.println("Record Deleted.");
                                            for (int j = posBk-1; j < brk; j++) {
                                                bk[j] = bk[j+1];
                                            }
                                            brk--;
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
                                            System.out.print("Enter Book ID: ");
                                            String bcode = sc_bk.nextLine();
                                            int posBk = func.binary_Search_BK(bk, brk-1, bcode);
                                            if(posBk > 0) {
                                                System.out.println("Record position is: " + posBk);
                                                bk[posBk-1].display();
                                            } 
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Booking--------");
                                        func.quickSortStrBK(bk, 0, brk-1);
                                        System.out.println("--------Sorted Record to Booking--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Booking--------");
                                        if (bk[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Book ID: ");
                                            String bkcode = sc_bk.nextLine();
                                            int posofBk = func.binary_Search_BK(bk,brk-1,bkcode);
                                            if(posofBk > 0) {
                                                System.out.print("Enter Book Date (YYYY/MM/DD) : ");
                                                bk[posofBk-1].setBook_date(sc_bk.nextLine());
                                                System.out.print("Enter Flight Status: ");
                                                bk[posofBk-1].setStatus(sc_bk.nextLine());
                                                System.out.print("Enter Number Of Tickets: ");
                                                bk[posofBk-1].setNo_of_tickets(o_num.nextInt());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            }
                                        }
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
                            int ccd = func.get_number();
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
                                        int posCC = func.binary_Search_CC(cc, crc-1, cc_code);
                                        if(posCC > 0) {
                                            System.out.println("Record Deleted.");
                                            for (int j = posCC-1; j < crc; j++) {
                                                cc[j] = cc[j+1];
                                            }
                                            crc--;
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
                                        //Search Record by binary search
                                        System.out.println("--------Searching Record from Cancelling--------");
                                        if (cc[0] == null) {
                                            System.out.println("...No Data Present in Record...");
                                        }
                                        else {
                                            System.out.print("Enter Cancel ID: ");
                                            String ccode = sc_cc.nextLine();
                                            int posCc = func.binary_Search_CC(cc, crc-1, ccode);
                                            if(posCc > 0) {
                                                System.out.println("Record position is: " + posCc);
                                                cc[posCc-1].display();
                                            } 
                                        }
                                    }
                                    case 5 -> {
                                        //Sort Record
                                        System.out.println("--------Sorting Record from Cancelling--------");
                                        func.quickSortStrCC(cc, 0, crc-1);
                                        System.out.println("--------Sorted Record to Cancelling--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Cancelling--------");
                                        if (cc[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Cancel ID: ");
                                            String cccode = sc_cc.nextLine();
                                            int posofCc = func.binary_Search_CC(cc,crc-1,cccode);
                                            if(posofCc > 0) {
                                                System.out.print("Enter Cancel Date (YYYY/MM/DD) : ");
                                                cc[posofCc-1].setCancel_date(sc_cc.nextLine());
                                                System.out.print("Enter Book ID: ");
                                                cc[posofCc-1].setBook_id(sc_cc.nextLine());
                                                System.out.print("Enter Surcharge: ");
                                                cc[posofCc-1].setSurcharge(o_num.nextInt());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            }
                                        }
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
                            int td = func.get_number();
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
                                        int posT = func.binary_Search_T(t, tr-1, t_code);
                                        if(posT > 0) {
                                            System.out.println("Record Deleted.");
                                            for (int j = posT-1; j < tr; j++) {
                                                t[j] = t[j+1];
                                            }
                                            tr--;
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
                                        func.quickSortStrT(t, 0, tr-1);
                                        System.out.println("--------Sorted Record to Ticket--------");
                                    }
                                    case 6 -> {
                                        //Edit Record
                                        System.out.println("--------Editing Record from Ticket--------");
                                        if (t[0] == null)
                                            System.out.println("...No Data Present in Record...");
                                        else {
                                            System.out.print("Enter Ticket Number: ");
                                            String tcode = sc_t.nextLine();
                                            int posofT = func.binary_Search_T(t,tr-1,tcode);
                                            if(posofT > 0) {
                                                System.out.print("Enter Class: ");
                                                t[posofT-1].setClass(sc_t.nextLine());
                                                System.out.print("Enter Passport No: ");
                                                t[posofT-1].setPassport_no(sc_t.nextLine());
                                                System.out.print("Enter Travel Date (YYYY/MM/DD) : ");
                                                t[posofT-1].setTravel_date(sc_t.nextLine());
                                                System.out.print("Enter Flight Code: ");
                                                t[posofT-1].setFlight_code(sc_t.nextLine());
                                                System.out.print("Enter Seat Number: ");
                                                t[posofT-1].setSeat_no(o_num.nextInt());
                                                System.out.print("Enter Price: ");
                                                t[posofT-1].setPrice(o_num.nextInt());
                                                System.out.print("Enter Airline Code: ");
                                                t[posofT-1].setAR_code(o_num.nextInt());
                                                System.out.println("---------------** SuccessFully Edited **-----------------");
                                            }
                                        }
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