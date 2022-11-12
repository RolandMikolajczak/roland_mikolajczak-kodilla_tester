package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Vw;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("..................................");
        System.out.println("This is :" + getCarName(car));
        System.out.println("1st gear speed is: " + car.getSpeed());



    }
    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi" ;
        else if (car instanceof Vw)
            return "Vw";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car model";
    }


}
