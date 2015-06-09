package com.realdolmen.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jeansmits on 9/06/15.
 */
@Component
public class FoodDistributionServiceImpl implements  FoodDistrubitionService{

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        for (Animal animal : animals) {
            Class<? extends Animal> c = animal.getClass();
            Food f = foodRepository.findFoodForAnimalType(c);
            animal.feed(f);
        }

    }
}
