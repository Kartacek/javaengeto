package com.engeto.ProjectTax;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListStates listStates = new ListStates();
        listStates.loadFromFile( "tax.txt","\t");

        /*ukol 1*/
        for (InfoStates state : listStates.getAllStates()) {
            System.out.println(state.getInfoStates());

        }
        System.out.println("----------------");
        /*ukol2*/
        listStates.getStates20();

        System.out.println("----------------");

        /*ukol3*/
        listStates.getStates20Sort();

        System.out.println("----------------");
        /*ukol4,5,6*/
        try {
            listStates.savetofile("vat-over-20.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ukoly 4,5,6 probehly");

        System.out.println("----------------");
        /*ukol7*/

        try {
            listStates.savestofile2();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
