package com.idurdyev.idcommerce.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main controller
 * @author Ilya Durdyev, ilya.durdyev@gmail.com, icq 159152
 */
@Controller
public class MainController {
    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("text", "Hello, world!");
        return "index";
    }
}
