package com.realdolmen.spring;

import com.realdolmen.spring.service.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by cda5732 on 25/03/2015.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfiguration.class);

        Zoo z = context.getBean(Zoo.class);
        System.out.println(z.getNaam());
        System.out.println(z.countAnimals());
//        Cat c=context.getBean(Cat.class);
//        System.out.println("Kat: " + c.getName());
//
//        Dog d=context.getBean(Dog.class);
//        System.out.println("Hond: " + d.getName());
//
//        Turtle t=context.getBean(Turtle.class);
//        System.out.println("Schildpad: " + t.getName());
        // TODO Fetch the Zoo class and print out its name and its animal count
        // TODO Test your code by running this main
    }
}
