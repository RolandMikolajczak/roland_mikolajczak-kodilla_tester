package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTestSuite {
    @Test
    public void shouldCheckTimeIfIsOtherThanBeans(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock bean1 = context.getBean(Clock.class);
        Clock bean2 = context.getBean(Clock.class);
        Clock bean3 = context.getBean(Clock.class);
        Assertions.assertNotEquals(bean1,bean2);
        Assertions.assertNotEquals(bean2,bean3);
        Assertions.assertNotEquals(bean1,bean3) ;
    }

}