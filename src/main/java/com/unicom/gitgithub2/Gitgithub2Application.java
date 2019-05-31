package com.unicom.gitgithub2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Gitgithub2Application {

    public static void main(String[] args) {
        SpringApplication.run(Gitgithub2Application.class, args);
    }

}
