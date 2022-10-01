package com.airline;

public class booking {
    String book_id, book_date, status;
    int no_of_tickets;

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_date() {
        return book_date;
    }

    public void setBook_date(String book_date) {
        this.book_date = book_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNo_of_tickets() {
        return no_of_tickets;
    }

    public void setNo_of_tickets(int no_of_tickets) {
        this.no_of_tickets = no_of_tickets;
    }
    public void display(){
        System.out.println("Booking ID: "+book_id);
        System.out.println("Book Date: "+book_date);
        System.out.println("Book Status: "+status);
        System.out.println("Number of Tickets: "+no_of_tickets);
    }
}
