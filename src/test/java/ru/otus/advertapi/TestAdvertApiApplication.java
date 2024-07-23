package ru.otus.advertapi;

import org.springframework.boot.SpringApplication;

public class TestAdvertApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(AdvertApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
