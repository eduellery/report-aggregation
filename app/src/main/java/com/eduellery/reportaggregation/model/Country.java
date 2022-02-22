package com.eduellery.reportaggregation.model;

public record Country(String countryName, Continent continent) {

    public Country(String countryName) {
        this(countryName, getContinent(countryName));
    }

    public static Continent getContinent(final String countryName) {
        return switch (countryName) {
            case "Congo" -> Continent.AFRICA;
            case "Brazil" -> Continent.AMERICA;
            case "Germany" -> Continent.EUROPE;
            default -> Continent.NOT_IMPLEMENTED;
        };
    }
}
