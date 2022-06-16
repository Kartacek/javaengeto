package com.engeto.plans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        InfoPlans plant1 = new InfoPlans("Pampeliska","je zluta",3,LocalDate.of(2020,3,2),LocalDate.of(2021,2,6));
        InfoPlans plant2 = new InfoPlans("Sedmikraska",3,LocalDate.of(2022,2,1));
        InfoPlans plant3 = new InfoPlans("Maceska");


        ListPlants listPlants = new ListPlants();
        try {
            listPlants.loadFromFile("plants.txt", "\t");
        } catch (PlantException e) {
            System.err.println("chyba"+e.getLocalizedMessage());
        }
        listPlants.addPlant(plant1);
        listPlants.addPlant(plant2);
        listPlants.addPlant(plant3);
        listPlants.plantRemove(2);

        for (InfoPlans plants : listPlants.getAllPlant()) {
            System.out.println(plants);
        }


        try {
            listPlants.saveToFile("plants1.txt","\t");
        } catch (PlantException e) {
            System.err.println("chyba"+e.getLocalizedMessage());
        }

    }
}