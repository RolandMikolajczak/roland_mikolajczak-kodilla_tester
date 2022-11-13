package com.kodilla.collections.adv.maps.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> schools = new HashMap<>();
        Principal Jan = new Principal("Jan","Kowalski","ILO");
        Principal Jerzy = new Principal("Jerzy","Kaczmarek","IILO");
        Principal Jaroslaw = new Principal("Jaroslaw","PolskeZbaw","IIILO");

        School IILO = new School(Arrays.asList(31,29,30));
        School ILO= new School(Arrays.asList(30,30,32));
        School IIILO = new School(Arrays.asList(28,25,25));

schools.put(Jan,ILO);
schools.put(Jaroslaw,IILO);
schools.put(Jerzy,IIILO);

        System.out.println(schools.get(Jan));

        for (Map.Entry<Principal,School> mapaSzkol:schools.entrySet()){
            System.out.println(mapaSzkol.getKey().getFirstname()+" "+mapaSzkol.getKey().getLastname()+" " +mapaSzkol.getKey().getSchoolNumber()+ ", Sum of Students: " + mapaSzkol.getValue().getSum());

        }
    }
}
