package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
        int rok = 1896;

        System.out.println(rok);

        if (rok % 4 != 0) {
            System.out.println("Rok nie Przestepny");
        } else if (rok % 100 != 0) {
            System.out.println("Rok przestepny");
        } else if (rok % 400 == 0) {
            System.out.println("Rok  Przestepny");
        } else
            System.out.println("Rok nie przestepny");
    }

}
