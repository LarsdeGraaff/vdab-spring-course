package com.realdolmen.spring.domain;

import org.springframework.context.annotation.Bean;


public interface Zoo {
    public void addAnimal(Animal animal);

    void releaseAnimal(Animal animal);

    boolean accept(Visitor visitor);

    public String getName();

    public Integer countAnimals();

}
