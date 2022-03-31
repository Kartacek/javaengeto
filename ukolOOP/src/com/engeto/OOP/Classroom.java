package com.engeto.OOP;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private int year;
    private String classteacher;




    public Classroom(String name, int year, String classteacher) {
        this.name = name;
        this.year = year;
        this.classteacher = classteacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getClassteacher() {
        return classteacher;
    }

    public void setClassteacher(String classteacher) {
        this.classteacher = classteacher;
    }

    public void getDescription(){
        System.out.println("Třída: "+ getName()+" (ročník: "+ getYear()+")");

    }
    public void getTeacher(String x , String y){
        System.out.println("Třídní učitel: "+x+","+y);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", classteacher='" + classteacher + '\'' +
                '}';
    }
}
