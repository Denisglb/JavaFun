package uk.co.MakersShopping.springbootapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.HashAttributeSet;
import org.json.simple.JSONObject;
import uk.co.MakersShopping.springbootapp.domain.ShoppingBasket;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;





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
        ShoppingBasket basket = new ShoppingBasket();
        JSONObject response = new JSONObject();
        for (int i = 0; i < basket.getList().size(); i++) {
            basket.getList().get(i);
            response.put("Price", basket.getList().get(i).getPrice());
            response.put("Description", basket.getList().get(i).getDescription());

        }
        return response;
    }
}
