package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Display {
    public void  display (double value){
        System.out.println("Wynik dzialania to : " + value);
    }
}
