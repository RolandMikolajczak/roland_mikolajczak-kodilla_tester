package com.kodilla.collections.interfaces.homework;

public class Vw implements Car{

    private int speed;

    public Vw(int speed){
        this.speed=speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {speed+=+24;
    }

    @Override
    public String toString() {
        return "Vw{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public void decreaseSpeed() {
        speed+=-19;
    }
}
