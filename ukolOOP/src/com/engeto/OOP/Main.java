package com.engeto.OOP;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {



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
            int h = listOfStudent.indexOf(e) + 1;
            System.out.println("# "+h+" # ID"+e.getID()+" - "+e.getName()+" "+e.getSurname()+" ("+e.getBorn()+")");
        }

        System.out.println("####################################");


        System.out.println(classroom.getName()+", "+teacher.getName()+" "+teacher.getSurname());
        System.out.println("ID"+student1.getID()+", "+student1.getName()+" "+student1.getSurname());
        System.out.println("ID"+student2.getID()+", "+student2.getName()+" "+student2.getSurname());
        System.out.println("ID"+student3.getID()+", "+student3.getName()+" "+student3.getSurname());


        PrintWriter out = new PrintWriter("class.txt");


        out.println("Třídní učitel: "+teacher.getSurname()+", "+teacher.getName());
        out.println("Počet studentů: "+listOfStudent.size());

        for (Student e : listOfStudent) {
            int h = listOfStudent.indexOf(e) + 1;
            out.println("# "+h+" # ID"+e.getID()+" - "+e.getName()+" "+e.getSurname()+" ("+e.getBorn()+")");
        }


        out.close();









    }

    }





