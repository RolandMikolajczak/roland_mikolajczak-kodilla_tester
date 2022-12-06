package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTestSuite {

    @Test
    public void shouldReturnTeacherNameIfExist (){
        Student student = new Student("Jan kowalski",new Teacher("Pawel Pluta"));
        String name = Application.getTeacherName(student);
        assertEquals("Pawel Pluta",name);
    }
    @Test
    public void shouldReturnUndefinedIfDoesntExist(){
        Student student = new Student("Roland Mikolajczak", null);
        String name = Application.getTeacherName(student);
        assertEquals("<undefined>",name);
    }
}
