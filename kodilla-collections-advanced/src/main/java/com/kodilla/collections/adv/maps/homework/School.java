package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classes = new ArrayList<>();

    public School(List<Integer> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School: " + classes.toString();
    }
    public double getSum(){
        double sum = 0.0;
        for (double classsum:classes)
             sum+=classsum;
        return  sum;

        }
    }


