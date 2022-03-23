package com.engetolekce02;

import java.time.LocalDate;

public class Booking {
    private LocalDate datestart;
    private LocalDate dateend;


    public Booking(LocalDate datestart, LocalDate dateend) {
        this.datestart = datestart;
        this.dateend = dateend;

    }

    public LocalDate getDate1() {

        return datestart;
    }

    public void setDate1(LocalDate date1) {

        this.datestart = datestart;
    }

    public LocalDate getDate2() {

        return dateend;
    }

    public void setDate2(LocalDate date2) {

        this.dateend = dateend;
    }
    public String getDescription(){
        return "od "+datestart+" do "+dateend;
    }
}
