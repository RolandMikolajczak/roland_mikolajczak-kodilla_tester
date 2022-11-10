package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtilis;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Vw;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }




    public static Car drawCar() {
        Random random = new Random();
        int drawTypeOfCar = random.nextInt(3);
        int a = getRandomSpeed(random);
        if (drawTypeOfCar==0)
            return new Audi(a);
        else if (drawTypeOfCar ==1)
            return new Vw(a);
        else
            return new Skoda(a);


        }



    private static int getRandomKind(Random random) {
        return random.nextInt(5);
    }

    private static int getRandomCapacity(Random random) {
        return random.nextInt(8);
    }

    private static int getRandomSpeed(Random random) {
        return random.nextInt(100);
    }
}
