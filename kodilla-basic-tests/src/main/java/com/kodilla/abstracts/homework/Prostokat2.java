package com.kodilla.abstracts.homework;

public class Prostokat2 extends Shape {

    public Prostokat2() {
        super(2,10);
    }

    @Override
    public void circuit(int dlugoscBoku2, int dlugoscBoku1) {
        super.circuit(2, 2);
    }

    @Override
    public void umiemLiczyc() {
        System.out.println("Prostokat2");
    }
}
