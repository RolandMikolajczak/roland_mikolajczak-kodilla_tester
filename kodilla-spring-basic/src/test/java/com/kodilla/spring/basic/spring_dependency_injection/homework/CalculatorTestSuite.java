package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {

    private ApplicationContext context;
    private Display display;
    private Calculator calculator;

    @BeforeEach
    public void setupAppContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        display = context.getBean(Display.class);
        calculator = context.getBean(Calculator.class);
    }
    @Test
    void shouldAdd (){
        Assertions.assertEquals(3,calculator.add(1,2));
    }
    @Test
    void shouldSubstract (){
        Assertions.assertEquals(2,calculator.subtruct(4,2));
    }
    @Test
    void shouldMultiply (){
        Assertions.assertEquals(4,calculator.multiply(2,2));
    }
    @Test
    void shouldDivide (){
        Assertions.assertEquals(1,calculator.divide(3,3));
    }
}