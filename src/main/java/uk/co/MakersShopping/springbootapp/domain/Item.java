package uk.co.MakersShopping.springbootapp.domain;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class Item {
    private Integer price;
    private String description;
    private Integer id;

    public Item(int price, String description, int id) {
        this.price = price;
        this.description = description;
        this.id = id;
    }

//    public Item(int newPrice) {
//        price = newPrice;
//    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }
}

