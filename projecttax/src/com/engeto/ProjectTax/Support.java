package com.engeto.ProjectTax;
import java.util.Scanner;
public class Support {

        private static Scanner scanner = null;
        private static Scanner getScanner() {
            if (scanner == null) {
                scanner = new Scanner(System.in);
            }
            return scanner;
        }

        public static int INVALID_INPUT = -1;


        public static double safeReadInt() {
            double result = INVALID_INPUT;
            double defaultnumber = 20;
            int zero = 0;
            String inputText = getScanner().nextLine();
            try {

                if(inputText.isEmpty()){
                    result = defaultnumber;

                }else{
                    result = Double.parseDouble(inputText);

                }
                if (result < 0){
                    System.err.println("Cislo nemuze byt zaporne, pokud je zaporne, bude automaticky pouzito defaultni cislo 20");
                }



            } catch (NumberFormatException ex) {
                System.err.println("Zadal jsi text, který nelze převést na celé číslo: "+inputText);
            }
            return result;
        }

    }

