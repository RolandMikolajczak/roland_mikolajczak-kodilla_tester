package com.kodilla.abstracts.homework;

public abstract class Shape {

private int dlugoscBoku1;
private int dlugoscBoku2;


public Shape (int dlugoscBoku1,int dlugoscBoku2){
    this.dlugoscBoku1 = dlugoscBoku1;
    this.dlugoscBoku2 = dlugoscBoku2;
    System.out.println("pole wynosi " + dlugoscBoku1*dlugoscBoku2);
}

public void circuit (int dlugoscBoku2, int dlugoscBoku1){
    this.dlugoscBoku2 =dlugoscBoku2;
    this.dlugoscBoku1 =dlugoscBoku1;
    System.out.println("Obwod wynosi " + (dlugoscBoku1 + dlugoscBoku2) * 2);

}

    public int getDlugoscBoku1() {
        return dlugoscBoku1;
    }

    public int getDlugoscBoku2() {
        return dlugoscBoku2;
    }




    public void umiemLiczyc() {

    }

}
