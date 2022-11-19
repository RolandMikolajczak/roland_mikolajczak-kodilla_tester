package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
private String departue;
private String arrival;

public Flight(String arrival, String departue){
    this.arrival = arrival;
    this.departue = departue;
}

    public String getDepartue() {
        return departue;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departue, flight.departue) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departue, arrival);
    }
}
