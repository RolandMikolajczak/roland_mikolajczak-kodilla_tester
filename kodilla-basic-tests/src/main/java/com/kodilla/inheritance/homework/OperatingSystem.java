package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int rokWydania;

    public void turnOn(){
        System.out.println("System is on");
    }
    public void turnOff(){
        System.out.println("System is Off");
    }

    public OperatingSystem(int rokWydania){
        System.out.println("Rok wydania systemu");
        this.rokWydania = rokWydania;

    }
    public void displayRokWydania(){
        System.out.println("Rok wydania to " + rokWydania);
    }

    public int getRokWydania() {
        return rokWydania;
    }
}
