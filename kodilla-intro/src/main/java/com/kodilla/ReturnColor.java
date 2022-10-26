package com.kodilla;

import java.util.Scanner;

public class ReturnColor {
    public static String nazwaKoloru() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (B-bialy, C-Czarny, Z-zloty, F-fioletowy:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B":
                    return "bialy";
                case "C":
                    return "czarny";
                case "Z":
                    return "zloty";
                case "F":
                    return "fioletowy";
                default:
                    System.out.println("Wrong selection. Try again.");
            }
        }
    }
}

