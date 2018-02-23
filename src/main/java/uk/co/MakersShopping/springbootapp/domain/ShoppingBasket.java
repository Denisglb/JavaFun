package uk.co.MakersShopping.springbootapp.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    @Autowired
    IItemFactory factory;

//    private IItemFactory factory;

//    public ShoppingBasket(IItemFactory factory)
//    {
//        this.factory = factory;
//    }

    List<Item> items = new ArrayList<Item>();
    public void add(int itemId) {
        Item item = factory.createItem(itemId);
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
//        for (String s = items) {
//            for (int count = 0; count <= items.size -1; count++);
//            System.out.println(s);
//        }
//        for(Item itemFromBasket:items) {
//            count += itemFromBasket.getDescription();
//       }
//    }
}
