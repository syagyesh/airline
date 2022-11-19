package com.airline;

import java.util.Scanner;

public class allfunction{

    generic<airline,airport> Al = new generic<>();
    generic<airport,booking> AP = new generic<>();
    generic<booking,cancelling> BK = new generic<>();
    generic<cancelling,connecting_flight> CC = new generic<>();
    generic<connecting_flight,employee> CF = new generic<>();


    Scanner functionSc = new Scanner(System.in);
    public int get_index(){
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
    public int get_number(){
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

    public int binary_Search_num(AL.getInt() aal[], int alhigh, int alcode){
        // if (aal[0] == null) {
        //     System.out.println("...No Data Present in Record...");
        //     return -1;
        // }
        // else {
        //     System.out.print("Enter Airline Code: ");
        //     int alcode = functionSc.nextInt();
            int beg, mid, end, pos=0;
            beg = 0;
            end = alhigh;
            while(beg<=end){
                mid = (beg+end)/2;
                if(alcode == aal[mid].getAR_code()){
                    System.out.println("---------- RECORD FOUND --------------");
                    // System.out.print("Record Position is : ");
                    // System.out.println(mid+1);
                    pos = 1;
                    return (mid+1);
                    // aal[mid].display();
                    // break;
                }
                else if(alcode < aal[mid].getAR_code()){
                    end = mid-1;
                }
                else {
                    beg = mid+1;
                }
            }
            if(pos == 0) {
                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                return -1;
            }
            return -1;
        }
    public int binary_Search_Str(airport aap[], int aphigh, String apcode){
        // if (aap[0] == null) {
        //     System.out.println("...No Data Present in Record...");
        //     return -1;
        // }
        // else {
        //     System.out.print("Enter IATA Code: ");
        //     String apcode = functionSc.nextLine();
            int beg, mid, end, pos=0;
            beg = 0;
            end = aphigh;
            while(beg<=end){
                mid = (beg+end)/2;
                if(apcode.equals(aap[mid].getIATA_code())){
                    System.out.println("---------- RECORD FOUND --------------");
                    pos = 1;
                    return (mid+1);
                }
                else if(apcode.compareTo(aap[mid].getIATA_code())<0){
                    end = mid-1;
                }
                else {
                    beg = mid+1;
                }
            }
            if(pos == 0){
                System.out.println("----------- RECORD IS NOT PRESENT ---------");
                return -1;
            }
            return -1;
        }

    public int partitionNum (airline atl[], int low , int alhigh) {
        int pivot = atl[alhigh].getAR_code();  
        int i = (low - 1);
        airline ar1 = new airline(); 
        for (int j = low; j <= alhigh- 1; j++) {
            if (atl[j].getAR_code() < pivot) {
                i++;
                ar1 = atl[i];
                atl[i] = atl[j];
                atl[j] = ar1;
            }
        }
        ar1 = atl[i+1];
        atl[i+1] = atl[alhigh];
        atl[alhigh] = ar1;
        return (i + 1);
    }
    public void quickSortNum(airline atl[], int low, int alhigh) {
        if (low < alhigh) {
            int pi = partitionNum(atl ,low, alhigh);
            quickSortNum(atl, low, pi-1); 
            quickSortNum(atl, pi + 1, alhigh);
        }
    }

    public int partitionStr (airport[] atp, int low , int aphigh) {
        String pivot = atp[aphigh].getIATA_code();  
        int i = (low - 1);
        airport ar2 = new airport(); 
        for (int j = low; j <= aphigh- 1; j++) {
            if (atp[j].getIATA_code().compareTo(pivot)<0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i+1];
        atp[i+1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }
    public void quickSortStr(airport[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStr(atp ,low, aphigh);
            quickSortStr(atp, low, pi-1);
            quickSortStr(atp, pi + 1, aphigh);
        }
    }
}