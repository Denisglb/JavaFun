package uk.co.MakersShopping.springbootapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasketController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Welcome to Java, I don't know how i got here!";
    }

}