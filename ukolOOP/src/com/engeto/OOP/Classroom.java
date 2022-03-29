package com.engeto.OOP;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private int year;
    private String classteacher;

    List<Student> listOfStudent = new ArrayList<>();


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








}
