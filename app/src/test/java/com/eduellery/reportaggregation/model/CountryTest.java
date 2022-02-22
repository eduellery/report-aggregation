package com.eduellery.reportaggregation.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryTest {

    @ParameterizedTest
    @MethodSource("getCountries")
    void name(String country, Continent continent) {
        Country actual = new Country(country);
        assertEquals(country, actual.countryName());
        assertEquals(continent, actual.continent());
    }

    private static Stream<Arguments> getCountries() {
        return Stream.of(
                Arguments.of("Congo", Continent.AFRICA),
                Arguments.of("Brazil", Continent.AMERICA),
                Arguments.of("Germany", Continent.EUROPE),
                Arguments.of("Japan", Continent.NOT_IMPLEMENTED)
        );
    }
}