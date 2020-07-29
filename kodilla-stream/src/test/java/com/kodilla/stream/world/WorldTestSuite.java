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

        Country germany = new Country("Germany", BigDecimal.valueOf(10000000));
        Country poland = new Country("Poland", new BigDecimal("10000000"));
        Country denmark = new Country("Denmark", new BigDecimal("459000"));
        Country kenya = new Country("Kenya", new BigDecimal("765432"));
        Country somalia = new Country("Somalia", BigDecimal.valueOf(560009));
        Country usa = new Country("USA",  BigDecimal.valueOf(1000000020));
        Country canada = new Country("Canada",new BigDecimal("345678"));


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
        BigDecimal totalPeopleExpected = new BigDecimal("1022130139");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}

