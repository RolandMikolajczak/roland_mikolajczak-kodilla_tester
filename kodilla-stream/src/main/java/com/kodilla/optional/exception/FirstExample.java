package com.kodilla.optional.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Roland";
        if (username != null) {
            String[] nameParts = username.split(" ");
            System.out.println("Firstname: " + nameParts[0]);
            if (nameParts.length > 1) {
                System.out.println("Lastname: " + nameParts[1]);
            }
        }
    }
}