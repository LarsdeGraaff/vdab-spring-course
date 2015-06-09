package com.realdolmen.spring.domain;


public class ZooImpl implements Zoo {

    @Override
    public void addAnimal(Animal animal) {
        Animal kat= new Cat("Oesje");
        Animal hond=new Dog ("Samson");
        Animal schildpad=new Turtle("Michelangelo");
    }

    @Override
    public void releaseAnimal(Animal animal) {

    }

    @Override
    public boolean accept(Visitor visitor) {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer countAnimals() {
        return null;
    }
}
