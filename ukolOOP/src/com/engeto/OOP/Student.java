package com.engeto.OOP;

import java.time.LocalDate;

public class Student extends Teacher {
    private int born;
    private int ID;

    public Student(String name, String surname, int born, int ID) {
        super(name, surname);
        this.born = born;
        this.ID = ID;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "born=" + born +
                ", ID=" + ID +
                '}';
    }
}
