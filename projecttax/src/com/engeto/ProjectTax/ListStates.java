package com.engeto.ProjectTax;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListStates  {

    //List<InfoStates> listStates = new ArrayList<>();
    List<InfoStates> listStates = new ArrayList<>();





    public void loadFromFile(String filename, String delimiter) {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader(filename)));) {
            while (s.hasNextLine()) {
                String order = s.nextLine();
                String order2 = order.replace(",", ".");
                //String inputLine = s.nextLine();
                String[] parts = order2.split(delimiter);


                String shortcut = parts[0];
                String name = parts[1];
                Double tax = Double.parseDouble(parts[2]);
                Double reductiontax = Double.parseDouble(parts[3]);
                Boolean specialtax = Boolean.parseBoolean(parts[4]);


                InfoStates liststates = new InfoStates(shortcut, name, tax, reductiontax, specialtax);
                listStates.add(liststates);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void getStates20(){
        for (InfoStates state:listStates) {
            int number = 20;
            if (state.getTax()> number && !state.getSpecialtax()){
                System.out.println(state.getInfoStates());
            }


        }
    }
    public void getStates20Sort(){
        Collections.sort(listStates);
        for (InfoStates state:listStates) {
            int number = 20;
            if (state.getTax()> number && !state.getSpecialtax()){
                System.out.println(state.getInfoStates());
            }

        }
        System.out.println("====================");
        System.out.print("Sazba VAT 20 % nebo nižší nebo používají speciální sazbu: ");
        for (InfoStates state:listStates) {
            int number1 = 20;
            if (state.getSpecialtax() == true || state.getTax() <= number1 ){
                System.out.print(state.getShortcut() + ",");

            }

        }
        //System.out.println("----------");
    }
    public void savetofile(String Filename) throws Exception{
        try(PrintWriter writer = new PrintWriter(new FileWriter(Filename))) {
            Collections.sort(listStates);
            for (InfoStates state:listStates) {
                int number = 20;
                if (state.getTax()> number && !state.getSpecialtax()){
                    writer.println(state.getInfoStates());

                }

            }
            writer.println("====================");
            writer.print("Sazba VAT 20 % nebo nižší nebo používají speciální sazbu: ");
            for (InfoStates state:listStates) {
                int number1 = 20;
                if (state.getSpecialtax() == true || state.getTax() <= number1 ){
                    writer.print(state.getShortcut() + ",");

                }
            }

        }
    }
    public void savestofile2() throws Exception{
        System.out.println("ZADEJ CISLO:");
        int number3 =  (int) Support.safeReadInt();
        try(PrintWriter writer = new PrintWriter(new FileWriter(number3+".txt"))){
            for (InfoStates state:listStates) {
                if (number3 <state.getTax()){
                    System.out.println(state.getInfoStates());
                }
            }
            for (InfoStates state:listStates) {
                if (number3 <state.getTax()){
                    writer.println(state.getInfoStates());
                }
            }
            writer.println("====================");
            writer.print("Sazba VAT "+number3+" % nebo nižší: ");
            for (InfoStates state:listStates) {
                //int number1 = number3;
                if (state.getTax() <= number3 ){
                    writer.print(state.getShortcut() + ",");

                }
            }

        }
    }




    public List<InfoStates> getAllStates(){
        return new ArrayList<>(listStates);
    }
    public void addState(InfoStates states){
        listStates.add(states);

    }



}
