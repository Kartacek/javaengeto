package com.engetolekce02;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Guest atributy1 = new Guest("Adélu Malíkovou",LocalDate.of( 1993,3,13));
        Guest atributy2 = new Guest("Jana Dvořáčka",LocalDate.of(1995,5,5));

        System.out.println(atributy1.getDescription());
        System.out.println(atributy2.getDescription());

        Rooms room1 = new Rooms(1,1,true,true,10002);
        Rooms room2 = new Rooms(2,1,true,true,1000);
        Rooms room3 = new Rooms(3,3,true,false,2400);

        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        Booking booking1 = new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        Booking booking2 = new Booking(LocalDate.of(2021,9,1),LocalDate.of(2021,9,14));

        Bookings booking = new Bookings();
        booking.AddBooking(booking1);
        booking.AddBooking(booking2);
        for (Bookings booking: bookings) {
            System.out.println(Booking.);

        }




        System.out.println(atributy1.getName()+" POKOJ CISLO: "+room1.getInfo()+" "+booking1.getDescription());
        System.out.println(atributy1.getName()+","+atributy2.getName()+" POKOJ CISLO: "+room3.getInfo()+" "+booking2.getDescription());





    }
}
