package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/test")
    public String showInfo() {
        return "App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working";
    }

    @RequestMapping("/super-test")
    public String showTest() {
        return "App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working"
               + "\n App is working";
    }
}
