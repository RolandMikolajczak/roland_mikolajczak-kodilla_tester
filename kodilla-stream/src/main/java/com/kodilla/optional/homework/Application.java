package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SortedMap;

public class Application {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Jan Kowalski", new Teacher("Janina Kowalska")));
        studentsList.add(new Student("Jerzy Kowalski",new Teacher("Jaroslaw Kowalski")));
        studentsList.add(new Student("Roland Mikolajczak", null));
        studentsList.add(new Student("Wojciech Bogusz",new Teacher("Pawel Pluta")));

        for (Student students : studentsList){
            String teacherName = getTeacherName(students);
            System.out.println("Student: " + students.getName() + " Teacher: " + teacherName);
        }

            
        }
        public static String getTeacherName(Student students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(students.getTeacher());
            String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            return teacher;

    }
}
