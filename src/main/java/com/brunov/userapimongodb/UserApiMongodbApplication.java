package com.brunov.userapimongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class UserApiMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApiMongodbApplication.class, args);
    }

}
