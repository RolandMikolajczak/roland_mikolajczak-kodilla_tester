package com.kodilla;

public class zwracanie {
    public int liczbaZnakow (String dlougoscZnakow ){
        return dlougoscZnakow.length();
    }

    public static void main(String[] args) {
        String iloscZnakow = "test";
        zwracanie liczbaZnakow = new zwracanie();
        int wynik = liczbaZnakow.liczbaZnakow(iloscZnakow);
        System.out.println(wynik);
    }}
