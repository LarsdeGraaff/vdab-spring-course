package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

import java.util.List;

public class JpaFoodRepository {

    // TODO: Create a transactional repository bean implementing FoodRepository
            private FoodRepository foodRepository;
    // TODO: implement findFoodById()

    public Food findFoodById(int id) {
        return foodRepository.findFoodById(id);
    }

    public List<Food> findAllFood() {
        return foodRepository.findAllFood();
    }

    public List<Food> findFoodForAnimalType(Animal.Type type) {
        return foodRepository.findFoodForAnimalType(type);
    }

    public void removeFood(Food food) {
        foodRepository.removeFood(food);
    }

    // TODO: implement findAllFood()

    // TODO: implement findFoodForAnimalType()

    // TODO: implement removeFood()
}
