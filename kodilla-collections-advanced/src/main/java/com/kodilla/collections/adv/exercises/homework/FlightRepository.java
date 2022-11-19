package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable(){
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Poznan","Krakow"));
        flightList.add(new Flight("Warszawa","Poznan"));
        flightList.add(new Flight("Gdansk","Poznan"));
        flightList.add(new Flight("Wroclaw","Warszawa"));
        return flightList;
    }
}
