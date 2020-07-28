package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private  final String countryName;
    private final BigDecimal peopleQty;

    public Country(String countryName, BigDecimal peopleQty) {
        this.countryName = countryName;
        this.peopleQty = peopleQty;
    }

    public Country(final  String countryName){
        this(countryName, new BigDecimal("10000001"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(peopleQty, country.peopleQty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, peopleQty);
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQty;
    }
}
