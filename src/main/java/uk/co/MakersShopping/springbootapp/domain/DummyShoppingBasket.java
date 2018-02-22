package uk.co.MakersShopping.springbootapp.domain;

import java.util.ArrayList;

public class DummyShoppingBasket implements IShoppingBasket{

    ArrayList<Item> items = new ArrayList<Item>();

    public void createList() {
        items.add(new Item(25, "Cheese"));
        items.add(new Item(50, "Cake"));

    }



    public ArrayList<Item> getList() {
        return items;
    }
}
