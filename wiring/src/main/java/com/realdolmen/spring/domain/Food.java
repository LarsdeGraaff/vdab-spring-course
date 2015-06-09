package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 9/06/15.
 */
public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ": " + name;
    }

}
