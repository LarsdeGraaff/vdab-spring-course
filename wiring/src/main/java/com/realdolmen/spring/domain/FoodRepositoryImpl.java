package com.realdolmen.spring.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class FoodRepositoryImpl implements FoodRepository {
    private Map<Class<? extends Animal>,Food> feed = new HashMap<>();

    public void addFoodForAnimalType(Class<? extends Animal> c, Food food){
        feed.put(c, food);
    }

    public Food findFoodForAnimalType(Class<? extends Animal> c){
        return feed.get(c);
    }
}
