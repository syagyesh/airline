package com.airline;

public class generic<T> {
    public T data;

    public void setdata(T data) {
        this.data = data;
    }
    
    public T getdata() {
        return (T) getClass().getName();
    }
}

