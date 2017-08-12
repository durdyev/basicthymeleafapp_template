package com.idurdyev.idcommerce.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Main controller
 * @author Ilya Durdyev, ilya.durdyev@gmail.com, icq 159152
 */
@Controller
public class MainController {
    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("name", "Hello, world");
        return "index";
    }
}
