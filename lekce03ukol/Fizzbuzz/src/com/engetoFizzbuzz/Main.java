package com.engetoFizzbuzz;

import java.util.SimpleTimeZone;

public class Main {

    public static void main(String[] args) {
	/*int cislo = 5;
    int cislo2 =  cislo % 3;
    System.out.println(cislo2);*/
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FIZZBUZZ");
            }else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }else if (i % 3 == 0) {
                System.out.println("FIZZ");
            }else {
                System.out.println(i);
            }

        }

    }
}
