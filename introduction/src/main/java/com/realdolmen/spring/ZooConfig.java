package com.realdolmen.spring;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.Zoo;
import com.realdolmen.spring.service.ZooImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooConfig {
    @Bean
    public Zoo zoo(){
        ZooImpl z = new ZooImpl("planckendael");
        z.addAnimal(new Cat("Oesje"));
        return new ZooImpl("Planckendael");

    }

//    @Bean
//    public Animal cat(){
//        return new Cat("oesje");
//
//    }
//
//    @Bean
//    public Animal dog(){
//        return new Dog("Samson");
//    }
//
//    @Bean
//    public Animal turtle(){
//        return new Turtle("Michelangelo");
//    }
}
