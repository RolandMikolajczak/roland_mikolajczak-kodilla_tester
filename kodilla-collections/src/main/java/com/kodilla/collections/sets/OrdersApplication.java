package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrdersApplication {
    public static void main(String[] args) {
        Set<Orders> order = new HashSet<>();
        order.add(new Orders("1/2019","Iron",1));
        order.add(new Orders("2/2019","Cutlery",6));
        order.add(new Orders("3/2019","Chair",2));
        order.add(new Orders("1/2019","Iron", 1));

        System.out.println(order.size());
        for (Orders orders: order) System.out.println(orders);


        }
    }
