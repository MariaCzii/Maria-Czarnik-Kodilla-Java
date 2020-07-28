package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void TestGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent america = new Continent("America");

        Country germany = new Country("Germany");
        Country poland = new Country("Poland");
        Country denmark = new Country("Denmark");
        Country kenya = new Country("Kenya");
        Country somalia = new Country("Somalia");
        Country usa = new Country("USA");
        Country canada = new Country("Canada");


        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(america);

        europe.addCountry(germany);
        europe.addCountry(poland);
        europe.addCountry(denmark);

        africa.addCountry(kenya);
        africa.addCountry(somalia);

        america.addCountry(usa);
        america.addCountry(canada);


        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("70000007");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}

