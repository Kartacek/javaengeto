package com.engetolekce02;

import java.util.ArrayList;
import java.util.List;

public class Bookings {
    List<Booking> bookings = new ArrayList<>();


    public void AddBooking(Booking newbooking){
        bookings.add(newbooking);
    }
}
