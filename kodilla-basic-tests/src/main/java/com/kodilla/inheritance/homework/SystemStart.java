package com.kodilla.inheritance.homework;

public class SystemStart {
    public static void main(String[] args) {
        OperatingSystem operatingSystem= new OperatingSystem (2018);
        operatingSystem.turnOn();
        operatingSystem.displayRokWydania();

        System1 system1 = new System1(2020);
        system1.turnOn();
        System.out.println(system1.getRokWydania());

        System2 system2 = new System2(2022);
        system2.turnOn();
        System.out.println(system2.getRokWydania());

    }
}
