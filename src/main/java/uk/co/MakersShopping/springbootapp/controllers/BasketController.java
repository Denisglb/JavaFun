package uk.co.MakersShopping.springbootapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.HashAttributeSet;
import org.json.simple.JSONObject;
import uk.co.MakersShopping.springbootapp.domain.DummyShoppingBasket;
import uk.co.MakersShopping.springbootapp.domain.ShoppingBasket;

import java.util.*;


@Controller
public class BasketController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Welcome to Java, I don't know how i got here!";
    }

    @RequestMapping("/oleg")
    @ResponseBody
    ArrayList array() {
        DummyShoppingBasket basket = new DummyShoppingBasket();
        ArrayList<JSONObject> items = new ArrayList<JSONObject>();
        basket.createList();
        for (int i = 0; i < basket.getList().size(); i++) {
            JSONObject response = new JSONObject();
            response.put("Price", basket.getList().get(i).getPrice());
            response.put("Description", basket.getList().get(i).getDescription());
            items.add(response);
        }
        return items;
    }
}

