package com.realdolmen.spring;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
    @Profile("production")
    public FoodRepositoryImpl foodRepository() {
        FoodRepositoryImpl foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class, new Food("Meaty food"));
        foodRepository.addFoodForAnimalType(Elephant.class, new Food("Carrot"));
        foodRepository.addFoodForAnimalType(Bear.class, new Food("good old juicy human people"));
    return foodRepository;
}

    @Bean
    @Profile("test")
    public FoodRepository testFoodRepository(){
        FoodRepository foodRepository=new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class, new Kibble("kibblen TIGER"));
        foodRepository.addFoodForAnimalType(Elephant.class, new Kibble("kibblen ELEPHANT"));
        foodRepository.addFoodForAnimalType(Bear.class, new Kibble("kibblen BEAR"));
        return foodRepository;    }
}
