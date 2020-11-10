package com.LabB.drink.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DrinkOfTheDay {

    @JsonProperty("drinks")
    private List<Drink> drinks; //took me forever to realize that all the strings are in a list

    public DrinkOfTheDay(){}


}
