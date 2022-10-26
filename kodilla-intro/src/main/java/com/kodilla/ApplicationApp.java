package com.kodilla;

public class ApplicationApp {
    public static void main(String[] args) {

        User uzytkownik = new User("Adam", 40.5, 178);
        System.out.println(uzytkownik.name + " " + uzytkownik.age + " " + uzytkownik.height);
        uzytkownik.Czlowiek();

    }
}
