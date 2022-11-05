package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Vw vw = new Vw(0);
        doRace(vw);

        Audi audi = new Audi(0);
        doRace(audi);

        Skoda skoda = new Skoda(0);
        doRace(skoda);

    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed() + car.increaseSpeed() + car.increaseSpeed() + car.decreaseSpeed() + car.decreaseSpeed()+ car.getSpeed());
    }
}
