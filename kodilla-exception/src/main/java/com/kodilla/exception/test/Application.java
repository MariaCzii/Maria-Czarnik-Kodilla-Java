package com.kodilla.exception.test;

public class Application {

    public static void main(String[] args) {
        Flight jfkTolhr = new Flight("JFK", "LHR");
        Flight wawToPvg = new Flight("WAW", "PVG");
        Flight mxpToJFK = new Flight("MXP", "JFK");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean existJfkLhr = flightSearcher.findFlight(jfkTolhr);
            System.out.println("Flight New York City - London Heathrow: " + existJfkLhr);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existWawToPvg = flightSearcher.findFlight(wawToPvg);
            System.out.println("Flight Warsaw - Shanghai: " + existWawToPvg);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existMxpToJFK = flightSearcher.findFlight(mxpToJFK);
            System.out.println("Flight Milan - New York City: " + existMxpToJFK);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

    }
}

