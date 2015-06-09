package com.realdolmen.spring.service;

import org.springframework.stereotype.Component;

/**
 * Created by jeansmits on 9/06/15.
 */
@Component
public class AwesomeMixVolume1 implements Casette {

    private String title="Awesome Mix Volume 1";
    private String artist = "Various artists";


    public void play(){
        System.out.println("Playing " + title + " by " + artist);
    }
}
