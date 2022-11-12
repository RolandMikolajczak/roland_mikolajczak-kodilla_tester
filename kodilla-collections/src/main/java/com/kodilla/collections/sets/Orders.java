package com.kodilla.collections.sets;

import java.util.Objects;

public class Orders {
    private String orderNumber;
    private String productName;
    private double quantity;

    public Orders (String orderNumber,String productName,double quantity){
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;


    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Double.compare(orders.quantity, quantity) == 0
                && this.orderNumber.equals(orders.orderNumber)
                && this.productName.equals(orders.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productName, quantity);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderNumber=" + orderNumber +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
