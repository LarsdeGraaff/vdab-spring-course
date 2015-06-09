package com.realdolmen.spring;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
@ComponentScan
public class ZooConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }

    @Bean
    public FoodRepositoryImpl foodRepository() {
        FoodRepositoryImpl foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class, new Food("Meaty food"));
        foodRepository.addFoodForAnimalType(Elephant.class, new Food("Carrot"));
        foodRepository.addFoodForAnimalType(Bear.class, new Food("good old juicy human people"));
        return foodRepository;
    }
}
