package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{

    private  int speed;

    public Skoda(int speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Skoda{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += +19;
    }

    @Override
    public void decreaseSpeed() {
        speed+= - 21;
    }
}
