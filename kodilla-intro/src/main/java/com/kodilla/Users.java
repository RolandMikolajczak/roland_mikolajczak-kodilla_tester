package com.kodilla;

import java.util.Arrays;

public class Users {
    String name;
    int age;

    int size;

    int roznica;



    public Users(String name, int age) {

        this.name = name;
        this.age = age;
        int suma = 0;
        this.size =0;

    }

    public static void main(String[] args) {


        Users anna = new Users("Anna", 20);
        Users betty = new Users("Betty", 33);
        Users carl = new Users("Carl", 58);
        Users david = new Users("David", 13);
        Users eva = new Users("Eva", 18);
        Users frankie = new Users("Frankie", 45);

        Users[] users = {anna, betty, carl, david, eva, frankie};


        double sumAge = 0;
        int suma = 0;
        for (int i = 0; i < users.length; i++) {
            suma = suma + users[i].age;
            System.out.println(suma);
        }
        int srednia;
        srednia = suma/users.length;
        System.out.println(srednia);

        int sum = 0;
        int ponizejSredniej = srednia;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < srednia) {
                System.out.println(users[i].name);
            }
        }
        }
        }








