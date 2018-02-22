package uk.co.MakersShopping.springbootapp.domain;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatcherAssert.*;

class ItemTest {
    @Test
    public void canCreateItemWithDescription(){
        Item item = new Item(100, "cheese");
    }

    @Test
    public void canCreateItemWithPrice(){
        Item item = new Item(100);
    }

    @Test
    public void canGetItemPrice(){
        Item item = new Item(100);
        assertThat(item.getPrice(), is (100));
    }

    @Test
    public void canGetItemDescription(){
        Item item = new Item(100, "cheese");
        assertThat(item.getDescription(), is("cheese"));
    }

}