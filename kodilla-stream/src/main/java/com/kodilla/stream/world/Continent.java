package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
    public boolean addCountry (Country country){
        return  listOfCountries.add(country);
    }
}
