package com.kodilla.abstracts.homework;

public class Person {
     String FirstName;
     Job job;
     int age;

     public Person(String FirstName,Job job,int age){
         this.FirstName = FirstName;
         this.job = job;
         this.age = age;
     }

    public static void main(String[] args) {

Job prawnik = new prawnik();
        Person person = new Person("Adam",prawnik,45);
         person.wyswietlObowiazki();
         prawnik.OpisPracy();
Job logistyk = new logistyk();
         Person Person1 = new Person("Kosma",logistyk,32);
        Person1.wyswietlObowiazki();
        logistyk.OpisPracy();
Job psycholog= new psycholog();
        Person Person2 = new Person("Wojtek",psycholog,38);
        Person2.wyswietlObowiazki();
        psycholog.OpisPracy();

     }
     public void wyswietlObowiazki(){
         System.out.println(this.FirstName+this.job.getResponibilities());
     }
}
