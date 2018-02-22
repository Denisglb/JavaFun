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
        basket.add(new Item(100, "cheese"));
    }

    @Test
    public void canGetLastItemFromShoppingBasket(){
        Item expected = new Item(100, "cheese");
        basket.add(expected);

        assertThat(basket.remove(), is(expected));
    }

    @Test
    public void canGetItemPriceTotalForSingleItem(){
        Item anItem = new Item(1);

        basket.add(anItem);

        assertThat(basket.calculateTotal(), is(1));
    }

    @Test
    public void canGetItemsPriceTotalForMultipleItems(){
        Item anItem = new Item(1);
        Item anotherItem = new Item(3);

        basket.add(anItem);
        basket.add(anotherItem);

        assertThat(basket.calculateTotal(), is(4));
    }

    
}
