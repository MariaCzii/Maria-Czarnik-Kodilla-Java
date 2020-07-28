package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listContinentsOfTheWorld = new ArrayList<>();


    public boolean addContinent(Continent continent){
        return  listContinentsOfTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQtyInTheWorld =  listContinentsOfTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));

        return peopleQtyInTheWorld;
    }
}
