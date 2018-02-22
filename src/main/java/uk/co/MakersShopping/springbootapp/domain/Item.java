package uk.co.MakersShopping.springbootapp.domain;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class Item {
    private Integer price;
    private String description;

    public Item(int price, String description) {
        this.price = price;
        this.description = description;
    }


    public Item(int newPrice) {
        price = newPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}

