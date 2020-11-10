package com.LabB.drink.controllers;

import com.LabB.drink.models.DrinkOfTheDay;
import com.LabB.drink.services.DrinkOfTheDayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DrinkController {

    @Autowired
    DrinkOfTheDayServiceImpl drinkServiceImpl;

    @GetMapping("/drink")
    public DrinkOfTheDay getDrink(){
        return drinkServiceImpl.getDrink();
    }


}
