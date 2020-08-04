package com.kodilla.exception.test;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    private final Map<String, Boolean> airportMap;

    public FlightSearcher() {
        airportMap = airportDataBase();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException {
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        } else {
            throw new RouteNotFoundException("Airport does not exist in database!");
        }
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("JFK", true);
        airportDataBase.put("LHR", true);
        airportDataBase.put("WAW", false);
        airportDataBase.put("PVG", false);
        airportDataBase.put("MXP", true);

        return airportDataBase;
    }
}