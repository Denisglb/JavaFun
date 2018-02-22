package uk.co.MakersShopping.springbootapp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ShoppingBasket {



    ArrayList<Item> items = new ArrayList<Item>();

    public ArrayList<Item> getList() {
        return items;
    }



    public void add(Item item) {
        items.add(item);
    }


    public Item remove() {
        return items.remove(items.size()-1);
    }

    public int calculateTotal() {
        int count = 0;
        for(Item itemFromBasket:items){
            count += itemFromBasket.getPrice();
        }
        return count;
    }

//    public String getDescriptionReceipt() {
//
//        for(String s = items){
//            for (int count = 0; count <= items.size -1; count++);
//            System.out.println(s);
//        }
//    }
}
