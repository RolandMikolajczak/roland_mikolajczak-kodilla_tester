package com.kodilla;

public class Notebook {
    public int weight;
    public int price;

    public int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        System.out.println();
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("This notebook is quite expensive.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }

    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light");
        } else if (this.weight > 600 && this.weight <= 1200) {
            System.out.println("This notebook is quite heavy");
        } else if (this.weight > 1200) {
            System.out.println("This notebook is heavy");
        }

    }

    public void checkYear() {
        if (this.year <= 2009 & this.price <=600) {
            System.out.println("This Notebook is old and cheap");
        } else if (this.year > 2010 && this.year <= 2019 & this.price > 600 && this.price <= 1000) {
            System.out.println("This notebook is pretty new and in good price");
        } else if (this.year > 2019 & this.price > 1000) {
            System.out.println("This notebook is new and quite expensive");
        }
    }






}

