package com.kodilla.optional.exception.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Warehouse {
    public Set<Order> orders = new HashSet<>();
    public void addOrder(Order order){
        orders.add(order);
        System.out.println("Order: " + order + " added");

    }

    public Order getOrder(String number) throws OrderDoesntExistException{
        Order result = orders.stream()
                .filter(o-> o.getNumber().equals(number))
                .findFirst().orElseThrow(() -> new OrderDoesntExistException());
        System.out.println("Searching for order number " + number);
        return result;
    }


}
