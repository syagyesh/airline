package com.airline;

import java.util.Scanner;

public class allfunction {
    Scanner functionSc = new Scanner(System.in);

    public int get_index() {
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

    public int get_number() {
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

    public int binary_Search_num(airline aal[], int alhigh, int alcode) {
        // if (aal[0] == null) {
        // System.out.println("...No Data Present in Record...");
        // return -1;
        // }
        // else {
        // System.out.print("Enter Airline Code: ");
        // int alcode = functionSc.nextInt();
        int beg, mid, end, pos = 0;
        beg = 0;
        end = alhigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (alcode == aal[mid].getAR_code()) {
                System.out.println("---------- RECORD FOUND --------------");
                // System.out.print("Record Position is : ");
                // System.out.println(mid+1);
                pos = 1;
                return (mid + 1);
                // aal[mid].display();
                // break;
            } else if (alcode < aal[mid].getAR_code()) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_AP(airport aap[], int aphigh, String apcode) {
        // if (aap[0] == null) {
        // System.out.println("...No Data Present in Record...");
        // return -1;
        // }
        // else {
        // System.out.print("Enter IATA Code: ");
        // String apcode = functionSc.nextLine();
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getIATA_code())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getIATA_code()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_BK(booking aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getBook_id())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getBook_id()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_CC(cancelling aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getCancel_id())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getCancel_id()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_CF(connecting_flight aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getFlight_code())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getFlight_code()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_EE(employee aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getSSN())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getSSN()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_F(flight aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getFlight_code())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getFlight_code()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_P(passenger aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getPassport_no())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getPassport_no()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int binary_Search_T(ticket aap[], int aphigh, String apcode) {
        int beg, mid, end, pos = 0;
        beg = 0;
        end = aphigh;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (apcode.equals(aap[mid].getT_number())) {
                System.out.println("---------- RECORD FOUND --------------");
                pos = 1;
                return (mid + 1);
            } else if (apcode.compareTo(aap[mid].getT_number()) < 0) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        if (pos == 0) {
            System.out.println("----------- RECORD IS NOT PRESENT ---------");
            return -1;
        }
        return -1;
    }

    public int partitionNum(airline atl[], int low, int alhigh) {
        int pivot = atl[alhigh].getAR_code();
        int i = (low - 1);
        airline ar1 = new airline();
        for (int j = low; j <= alhigh - 1; j++) {
            if (atl[j].getAR_code() < pivot) {
                i++;
                ar1 = atl[i];
                atl[i] = atl[j];
                atl[j] = ar1;
            }
        }
        ar1 = atl[i + 1];
        atl[i + 1] = atl[alhigh];
        atl[alhigh] = ar1;
        return (i + 1);
    }

    public void quickSortNum(airline atl[], int low, int alhigh) {
        if (low < alhigh) {
            int pi = partitionNum(atl, low, alhigh);
            quickSortNum(atl, low, pi - 1);
            quickSortNum(atl, pi + 1, alhigh);
        }
    }

    public int partitionStrAP(airport[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getIATA_code();
        int i = (low - 1);
        airport ar2 = new airport();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getIATA_code().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrAP(airport[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrAP(atp, low, aphigh);
            quickSortStrAP(atp, low, pi - 1);
            quickSortStrAP(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrBK(booking[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getBook_id();
        int i = (low - 1);
        booking ar2 = new booking();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getBook_id().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrBK(booking[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrBK(atp, low, aphigh);
            quickSortStrBK(atp, low, pi - 1);
            quickSortStrBK(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrCC(cancelling[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getCancel_id();
        int i = (low - 1);
        cancelling ar2 = new cancelling();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getCancel_id().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrCC(cancelling[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrCC(atp, low, aphigh);
            quickSortStrCC(atp, low, pi - 1);
            quickSortStrCC(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrCF(connecting_flight[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getFlight_code();
        int i = (low - 1);
        connecting_flight ar2 = new connecting_flight();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getFlight_code().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrCF(connecting_flight[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrCF(atp, low, aphigh);
            quickSortStrCF(atp, low, pi - 1);
            quickSortStrCF(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrEE(employee[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getSSN();
        int i = (low - 1);
        employee ar2 = new employee();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getSSN().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrEE(employee[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrEE(atp, low, aphigh);
            quickSortStrEE(atp, low, pi - 1);
            quickSortStrEE(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrF(flight[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getFlight_code();
        int i = (low - 1);
        flight ar2 = new flight();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getFlight_code().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrF(flight[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrF(atp, low, aphigh);
            quickSortStrF(atp, low, pi - 1);
            quickSortStrF(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrP(passenger[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getPassport_no();
        int i = (low - 1);
        passenger ar2 = new passenger();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getPassport_no().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrP(passenger[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrP(atp, low, aphigh);
            quickSortStrP(atp, low, pi - 1);
            quickSortStrP(atp, pi + 1, aphigh);
        }
    }

    public int partitionStrT(ticket[] atp, int low, int aphigh) {
        String pivot = atp[aphigh].getT_number();
        int i = (low - 1);
        ticket ar2 = new ticket();
        for (int j = low; j <= aphigh - 1; j++) {
            if (atp[j].getT_number().compareTo(pivot) < 0) {
                i++;
                ar2 = atp[i];
                atp[i] = atp[j];
                atp[j] = ar2;
            }
        }
        ar2 = atp[i + 1];
        atp[i + 1] = atp[aphigh];
        atp[aphigh] = ar2;
        return (i + 1);
    }

    public void quickSortStrT(ticket[] atp, int low, int aphigh) {
        if (low < aphigh) {
            int pi = partitionStrT(atp, low, aphigh);
            quickSortStrT(atp, low, pi - 1);
            quickSortStrT(atp, pi + 1, aphigh);
        }
    }
}