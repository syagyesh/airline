package com.airline;

public class cancelling {
    String cancel_id, cancel_date, book_id;
    int surcharge;

    public String getCancel_id() {
        return cancel_id;
    }

    public void setCancel_id(String cancel_id) {
        this.cancel_id = cancel_id;
    }

    public String getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(String cancel_date) {
        this.cancel_date = cancel_date;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public int getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(int surcharge) {
        this.surcharge = surcharge;
    }
    public void display(){
        System.out.println("Cancel ID: "+cancel_id);
        System.out.println("Cancel Date: "+cancel_date);
        System.out.println("Book ID: "+book_id);
        System.out.println("Surcharge: "+surcharge);
    }
}
