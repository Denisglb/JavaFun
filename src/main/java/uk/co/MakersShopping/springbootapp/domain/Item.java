package uk.co.MakersShopping.springbootapp.domain;

public class Item {
    private Integer price;
    private String description;

    public Item(String description) {

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

