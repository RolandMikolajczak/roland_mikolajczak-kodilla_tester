package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double value;
    private String login;
    private LocalDate date;

    public Order(double value, String login, LocalDate date) {
        this.value = value;
        this.login = login;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}