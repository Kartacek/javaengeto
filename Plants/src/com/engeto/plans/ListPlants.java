package com.engeto.plans;

import java.io.*;
import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPlants {

    List<InfoPlans> listPlant = new ArrayList<>();

    public void loadFromFile(String filename, String delimiter) {
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(filename)));) {
            while (s.hasNextLine()) {
                String inputLine = s.nextLine();
                String[] parts = inputLine.split(delimiter);

                String name = parts[0];
                String notes = parts[1];
                int frequencyOfWateringInDays = Integer.parseInt(parts[2]);
                LocalDate watering = LocalDate.parse(parts[3]);
                LocalDate planted = LocalDate.parse(parts[4]);


                InfoPlans listplants = new InfoPlans(name, notes, frequencyOfWateringInDays, watering, planted);
                listPlant.add(listplants);


            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public void saveToFile(String inputFilename, String delimiter) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(inputFilename))) {
            for (InfoPlans listPlants : listPlant) {
                String outputLine = listPlants.getName().toString()+delimiter;
                outputLine += listPlants.getNotes().toString()+delimiter;
                outputLine += listPlants.getFrequencyOfWateringInDays()+delimiter;
                outputLine += listPlants.getPlanted().toString()+delimiter;
                outputLine += listPlants.getWatering()+delimiter;
                writer.println(outputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
     }

    public void printArray(){
        for (InfoPlans e : listPlant) {
            System.out.println(e);
        }
    }

    public void addPlant(InfoPlans plant){
        listPlant.add(plant);
    }

    public InfoPlans getPlant(int index){
        return listPlant.get(index);
    }
    public void plantRemove(int index){
        listPlant.remove(index);
    }
    public int size() {
        return listPlant.size();
    }
    public List<InfoPlans> getAllPlant(){
        return new ArrayList<>(listPlant);
    }


}
