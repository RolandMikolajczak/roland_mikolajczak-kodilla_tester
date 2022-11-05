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
    public int increaseSpeed() {
        return speed+24;
    }

    @Override
    public int decreaseSpeed() {
        return speed-19;
    }
}
