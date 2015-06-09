package com.realdolmen.spring.service;


import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements Zoo {
private String naam;
    private List<Animal> animals=new ArrayList<>();

    public ZooImpl(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void releaseAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public boolean accept(Visitor visitor) {
        return false;
    }

    @Override
    public Integer countAnimals() {
        return animals.size();
    }
}
