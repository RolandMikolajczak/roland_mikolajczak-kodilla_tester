package com.kodilla.optional.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("344"));
        warehouse.addOrder(new Order("1234"));

        try {
            Order result = warehouse.getOrder("2");
            System.out.println(result);
        }catch (OrderDoesntExistException e) {
            System.out.println("order doesn't exist");
    }
}}
