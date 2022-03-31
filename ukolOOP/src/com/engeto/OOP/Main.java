package com.engeto.OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println("ahoj");


    Teacher teacher = new Teacher("Jan","Novák");

    Student student1 = new Student("Petr","Svoboda",2011,001);
    Student student2 = new Student("Milan","Říha",2010,123);
    Student student3 = new Student("Jindřich","Nový",2012,345);

    Classroom classroom = new Classroom("4.C",4,""+teacher);
    List<Student> listOfStudent = new ArrayList<>();

    listOfStudent.add(student1);

    listOfStudent.add(student2);

    listOfStudent.add(student3);


        System.out.println("####################################");
        classroom.getDescription();
        System.out.println("Třídní učitel: "+teacher.getSurname()+", "+teacher.getName());

        System.out.println("Počet studentů: "+listOfStudent.size());
        System.out.println("####################################");
        for (Student e : listOfStudent) {
            int h = listOfStudent.indexOf(e);
            h = h + 1;
            System.out.println("# "+h+" # ID"+e.getID()+" - "+e.getName()+" "+e.getSurname()+" ("+e.getBorn()+")");
        }













    }




}
