package uk.co.MakersShopping.springbootapp.domain;

public class Item {
    private Integer price;
    private String description;


    public Item(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

