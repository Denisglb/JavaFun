package uk.co.MakersShopping.springbootapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.co.MakersShopping.springbootapp.domain.Item;
import uk.co.MakersShopping.springbootapp.domain.ShoppingBasket;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingBasketTest {

    private ShoppingBasket basket;

    @BeforeEach
    void setUp() {
        basket = new ShoppingBasket();
    }

    @Test
    public void canAddToShoppingBasket(){
        basket.add(new Item(5,"cheese"));
    }

    @Test
    public void canGetLastItemFromShoppingBasket(){
        Item expected = new Item(10,"cheese");
        basket.add(expected);

        assertThat(basket.remove(), is(expected));
    }

    @Test
    public void canGetItemPriceTotalForSingleItem(){
        Item anItem = new Item(1, "Cake");

        basket.add(anItem);

        assertThat(basket.calculateTotal(), is(1));
    }

    @Test
    public void canGetItemsPriceTotalForMultipleItems(){
        Item anItem = new Item(1, "Cheese");
        Item anotherItem = new Item(3, "Cake");

        basket.add(anItem);
        basket.add(anotherItem);

        assertThat(basket.calculateTotal(), is(4));
    }

//    @Test
//    public void canListItemDescriptions(){
//        Item anItem = new Item("cheese");
//
//        basket.add(anItem);
//
//        assertThat(basket.getDescriptionReceipt(), is("cheese"));
//
//    }

    /*
    @Test
    public void canListManyItemDescriptions(){
        Item anItem = new Item("cheese");
        Item anotherItem = new Item("cake");
        basket.add(anItem);
        basket.add(anotherItem)

        assertThat(basket.getDescriptionReceipt(), is("cake\ncheese"));

    }
    */


}
