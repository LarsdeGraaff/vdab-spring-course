package com.realdolmen.spring.domain;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jeansmits on 9/06/15.
 */

@Component
public interface FoodDistrubitionService{

     void feedAnimalsByType(List<Animal> animals);
}
