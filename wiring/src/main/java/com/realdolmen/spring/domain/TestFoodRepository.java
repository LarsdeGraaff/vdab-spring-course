package com.realdolmen.spring.domain;


import java.util.HashMap;
import java.util.Map;

public class TestFoodRepository {
    private Map<Class<? extends Animal>,Food> feed = new HashMap<>();

    public void addFoodForAnimalType(Class<? extends Animal> c, Kibble kibble){
        feed.put(c, kibble);
    }

    public Food findFoodForAnimalType(Class<? extends Animal> c){
        return feed.get(c);
    }
}
