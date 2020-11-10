package com.LabB.drink.services;

import com.LabB.drink.models.DrinkOfTheDay;
//import com.LabB.drink.repositories.DrinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DrinkOfTheDayServiceImpl implements DrinkOfTheDayService {

    public DrinkOfTheDay getDrink() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/random.php", DrinkOfTheDay.class);
    }

}
