package uk.co.MakersShopping.springbootapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.HashAttributeSet;
import org.json.simple.JSONObject;


@Controller
public class BasketController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Welcome to Java, I don't know how i got here!";
    }

    @RequestMapping("/oleg")
    @ResponseBody
    JSONObject json() {
        JSONObject response = new JSONObject();
        response.put("Price", 100);
        response.put("Description", "Yummy");
        return response;
    }

}