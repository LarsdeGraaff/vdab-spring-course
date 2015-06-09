package com.realdolmen.spring.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by jeansmits on 9/06/15.
 */

@Component
public interface FoodRepository {
    public void addFoodForAnimalType(Class<? extends Animal> c, Food food);

    Food findFoodForAnimalType(Class<? extends Animal> c);

}
