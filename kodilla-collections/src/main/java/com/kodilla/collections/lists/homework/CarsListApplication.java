package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Vw;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars= new ArrayList<>();
        Audi audi = new Audi(250);
        cars.add(audi);
        cars.add(new Vw(300));
        cars.add(new Skoda(100));

        cars.remove(1);


        cars.remove(audi);

        System.out.println(cars.size());



        for (Car cars2022 : cars) {

            System.out.println(cars2022 + " " + cars2022.getSpeed());


        }
    }
}