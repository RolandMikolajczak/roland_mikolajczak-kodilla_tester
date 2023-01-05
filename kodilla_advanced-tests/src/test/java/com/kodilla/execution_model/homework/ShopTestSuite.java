package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    Order order1 = new Order(100,"rolandm", LocalDate.of(2022,11,01));
    Order order2 = new Order(10,"wojtekB",LocalDate.of(2022,11,02));
    Order order3 = new Order(200,"PawelP",LocalDate.of(2022,11,03));

    @BeforeEach
    public void initializeOrder(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrdersToList(){
        int numberOforders = shop.sizeOfOrderList();
        assertEquals(3,numberOforders);
    }
    @Test
    public void shouldSumAllOrders(){
        double sumOfOrders = shop.sumOfOrders();
        assertEquals(310,sumOfOrders);
    }
    @Test
            public void shouldReturnOrderFromRange() {
        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order1);
        assertEquals(expectedOrders,shop.getByDates(LocalDate.of(2022,10,30), LocalDate.of(2022,11,01)));
    }
    @Test
    public void shouldReturnEmptyListWhenOutOfrange(){
        assertEquals(new HashSet<>(),shop.getByValue(201,301));
    }


}