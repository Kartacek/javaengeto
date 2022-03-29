package com.engeto.OOP;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    System.out.println("ahoj");


    Teacher teacher = new Teacher("Jan","Novák");

    Student student1 = new Student("Petr","Svoboda",2011,001);
    Student student2 = new Student("Milan","Říha",2010,123);
    Student student3 = new Student("Jindřich","Nový",2012,345);

    Classroom classroom = new Classroom("4.C",4,""+teacher);






    }




}
