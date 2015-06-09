package com.realdolmen.spring.domain;

import com.realdolmen.spring.CasetteConfig;
import com.realdolmen.spring.service.Casette;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jeansmits on 9/06/15.
 */

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(CasetteConfig.class);
        context.getBean(Casette.class).play();
    }
}
