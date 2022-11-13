package com.kodilla.collections.adv.maps.complex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student,Grades> school = new HashMap<>();
        Student roland =new Student("Roland","Mikolajczak");
        Student wojtek = new Student("Wojciech","Bogusz");
        Student agnieszka = new Student("Agnieszka","Bogusz");

        Grades rolandGrades = new Grades(Arrays.asList( 5.0,4.5,4.0,5.0,5.0));
        Grades wojtekGrades = new Grades(Arrays.asList(2.5,3.0,2.0));
        Grades agnieszkaGrades = new Grades(Arrays.asList( 5.0,4.0,4.0,4.0,4.0));

        school.put(roland,rolandGrades);
        school.put(wojtek,wojtekGrades);
        school.put(agnieszka,agnieszkaGrades);

        System.out.println(school.get(roland));

        for (Map.Entry<Student,Grades> studentEntry:school.entrySet()) {
            System.out.println(studentEntry.getKey().getFirstName() + ", average: "+ studentEntry.getValue().getAverage());


        }
    }


    }

