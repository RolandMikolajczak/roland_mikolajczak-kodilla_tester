package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Niemiecki","2x2",true));
        stamps.add(new Stamp("Niemiecki","2x2",true));
        stamps.add(new Stamp("Polski","2x3",false));
        stamps.add(new Stamp("Czeski", "2x4",false));
        System.out.println(stamps.size());
        for (Stamp stamp: stamps) System.out.println(stamp);


        }
    }


