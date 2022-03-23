package com.engetolekce02;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Rooms {
    private int info;
    private int bed;
    private boolean balcony;
    private boolean view;
    private double price;


    public Rooms(int info, int bed, boolean balcony, boolean view, double price){
        this.info = info;
        this.bed = bed;
        this.balcony = balcony;
        this.view = view;
        this.price = price;

    }


    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public boolean isSea() {
        return balcony;
    }

    public void setSea(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptionBalcony(){
        if (balcony) {
            return "Ano";



        }else return "Ne";
    }
    public String getDescriptionSea(){
        if (view) {
            return "Ano";

        }else return "Ne";
    }

    public String getDescription(){
        return "cislo pokoje je: "+info+" pocet posteli: "+bed+" vyhled na more: "+getDescriptionBalcony()+" balkon: "+getDescriptionSea()+" cena za noc: "+price+" Kč";
    }
}
