package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void findFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Krakow");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poznan","Krakow"));
        assertEquals(expectedList,result);
    }

    @Test
    void findFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Poznan");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poznan","Krakow"));
        assertEquals(expectedList,result);
    }
}