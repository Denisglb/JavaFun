package uk.co.MakersShopping.springbootapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        basket.add(new Item(100, "cheese", 6));
    }

    @Test
    public void canGetLastItemFromShoppingBasket(){
        Item expected = new Item(100, "cheese", 8);
        basket.add(expected);

        assertThat(basket.remove(), is(expected));
    }

    @Test
    public void canGetItemPriceTotalForSingleItem(){
        Item anItem = new Item(1, "finger", 20);

        basket.add(anItem);

        assertThat(basket.calculateTotal(), is(1));
    }

    @Test
    public void canGetItemsPriceTotalForMultipleItems(){
        Item anItem = new Item(1, "toe", 7);
        Item anotherItem = new Item(3, "teeth", 8);

        basket.add(anItem);
        basket.add(anotherItem);

        assertThat(basket.calculateTotal(), is(4));
    }

}
