package com.kodilla.optional.exception.homework;

public class OrderDoesntExistException extends Exception{
    String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
