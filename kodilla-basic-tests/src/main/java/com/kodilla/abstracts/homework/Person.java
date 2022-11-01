package com.kodilla.abstracts.homework;

public class Person {
     String FirstName;
     String Job;
     int age;

     public Person(String FirstName,String Job,int age){
         this.FirstName = FirstName;
         this.Job = Job;
         this.age = age;
     }

    public static void main(String[] args) {

        Person Person = new Person("Adam","prawnik",45);
         System.out.println(Person.FirstName +" " + Person.Job);
         prawnik prawnik = new prawnik("Reprezentacja klientow przed sadami kazdej instancji na terenie Rp", 6000);
         prawnik.OpisPracy();

         Person Person1 = new Person("Kosma","logistyk",32);
        System.out.println(Person1.FirstName +" " + Person1.Job);
        logistyk logistyk = new logistyk("Kontrola operacji zatowarowania magazynow oraz zachowanie ciaglosci pracy",7000);
        logistyk.OpisPracy();

        Person Person2 = new Person("Wojtek","psycholog",38);
        System.out.println(Person2.FirstName +" " + Person2.Job);
        psycholog psycholog = new psycholog("ocena stanu zdrowiapsychicznego pacjenta",8000);
        psycholog.OpisPracy();

     }
}
