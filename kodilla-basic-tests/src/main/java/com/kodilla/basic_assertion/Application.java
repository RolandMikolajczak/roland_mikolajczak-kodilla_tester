package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.Sum(a,b);
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int  subResult = calculator.Sub(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3,subResult);
        if (correct1) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squereResult= calculator.Square(a);
        boolean correct2 = ResultChecker.assertEquals(25,squereResult,0.01);
        if (correct2) {
            System.out.println("Metoda squere działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squere nie działa poprawnie dla liczby " + a);
        }


    }
}
