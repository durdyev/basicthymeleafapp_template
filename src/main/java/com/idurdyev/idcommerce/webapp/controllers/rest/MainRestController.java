package com.idurdyev.idcommerce.webapp.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainRestController {
    @GetMapping("/hello")
    public String helloRest() {
        return "Hello, Rest from main application";
    }
}
