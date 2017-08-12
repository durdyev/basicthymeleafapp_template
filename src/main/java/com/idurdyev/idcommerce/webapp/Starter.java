package com.idurdyev.idcommerce.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * @author Ilya Durdyev, ilya.durdyev@gmail.com, icq 159152
 */
@SpringBootApplication
public class Starter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Starter.class, args);
    }
}
