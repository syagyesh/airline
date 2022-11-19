package com.airline;

public class generic<I,S> {
    I obj1;
    S obj2;
    
    public I getInt() {
        return obj1;
    }

    public S getStr() {
        return obj2;
    }

    public void setInt(I val1) {
        this.obj1 = val1;
    }

    public void setStr(S val2) {
        this.obj2 = val2;
    }
}
