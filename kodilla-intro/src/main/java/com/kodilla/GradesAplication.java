package com.kodilla;

public class GradesAplication {
    public static void main(String[] args) {
        Grades oceny = new Grades();
        oceny.add(6);
        oceny.add(3);
        oceny.add(2);
        oceny.add(5);

        System.out.println(oceny.zwrotOceny());
        System.out.println(oceny.sredniaOcen());
    }
}
