package com.kodilla;

public class Notebook {
    public int weight;
    public int price;
   public Notebook (int weight, int price) {
     this.weight = weight;
     this.price = price;
   }

       public void checkPrice() {
           if (this.price < 600) {
               System.out.println("This notebook is very cheap.");
           } else if (this.price > 600 && this.price <= 1000) {
               System.out.println("This notebook is quite expensive.");
           } else if (this.price > 1000) {
               System.out.println("This notebook is expensvie");
           }

           }
           public void checkWeight() {
       if (this.weight <= 600){
           System.out.println("This notebook is light");
       } else if (this.weight > 600 && this.weight<= 1200) {
           System.out.println("This notebook is quite heavy");}
       else if (this.weight > 1200){
           System.out.println("This notebook is heavy");}
               }

       }

