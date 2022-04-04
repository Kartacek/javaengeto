package com.engeto.plans;

import java.time.LocalDate;

public class InfoPlans {
    static final int DEFAULT_FREQUENCY_OF_WATERING = 7;

    private String name;
    private String notes;
    private int frequencyOfWateringInDays;
    private LocalDate watering;
    private LocalDate planted;

    public InfoPlans(String name) {
        /*this.name = name;
        notes = "";
        planted = LocalDate.now();
        watering = LocalDate.now();
        this.frequencyOfWateringInDays = DEFAULT_FREQUENCY_OF_WATERING;*/
        this(name,DEFAULT_FREQUENCY_OF_WATERING,LocalDate.now());




    }
    public InfoPlans(String name,int frequencyOfWateringInDays ,LocalDate planted ) {
        /*this.name = name;
        this.planted = planted;
        this.frequencyOfWateringInDays = frequencyOfWateringInDays;
        notes = "";
        watering = LocalDate.now();*/
        this(name, "",frequencyOfWateringInDays,planted,LocalDate.now());

    }


    public InfoPlans(String name, String notes, int frequencyOfWateringInDays,LocalDate watering,LocalDate planted) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWateringInDays = frequencyOfWateringInDays;
    }








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) {
        this.watering = watering;
    }

    public int getFrequencyOfWateringInDays() {
        return frequencyOfWateringInDays;
    }

    public void setFrequencyOfWateringInDays(int frequencyOfWateringInDays) {
        this.frequencyOfWateringInDays = frequencyOfWateringInDays;
    }

    public String getWaterInfo(){
        return name+" "+watering+" "+frequencyOfWateringInDays;
    }

    public String getDescription(){
        return name + notes + planted;
    }

    @Override
    public String toString() {
        return "InfoPlans{" +
                "name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", planted=" + planted +
                ", watering=" + watering +
                ", frequencyOfWateringInDays=" + frequencyOfWateringInDays +
                '}';
    }
}
