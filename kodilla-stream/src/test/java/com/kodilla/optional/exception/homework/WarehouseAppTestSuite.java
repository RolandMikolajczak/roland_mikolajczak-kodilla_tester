package com.kodilla.optional.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {
    @Test
    public void testGetOrder() throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();
        Order order = new Order("0");
        warehouse.addOrder(order);
        Order result = warehouse.getOrder("0");
        Order expectedOrder = order;
        assertEquals(expectedOrder,result);
    }
    @Test
    public void testIfOrderOnList_withException() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("3"));
        assertThrows(OrderDoesntExistException.class, ()-> warehouse.getOrder("4"));
        System.out.println("Nie ma takiego zamowienia");
    }

}