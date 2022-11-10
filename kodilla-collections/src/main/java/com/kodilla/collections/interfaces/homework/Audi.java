package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.arrays.homework.CarsApplication;

import java.util.Objects;

public class Audi implements Car{

    private int speed;

    public Audi (int speed){
        this.speed = speed;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
         speed += 25;

    }

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public void decreaseSpeed() {
        speed+=-20;

    }
}
