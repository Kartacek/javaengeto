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



    }
}
