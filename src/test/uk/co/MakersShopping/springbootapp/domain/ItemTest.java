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
        Item item = new Item(100, "cheese",4);
    }

    @Test
    public void canCreateItemWithPrice(){
        Item item = new Item(100, "baby ear", 5);
    }

    @Test
    public void canCreateItemWithId() {
        Item item = new Item(100, "Foot", 3);
    }

    @Test
    public void canGetItemPrice(){
        Item item = new Item(100, "nose", 8);
        assertThat(item.getPrice(), is (100));
    }

    @Test
    public void canGetItemDescription(){
        Item item = new Item(100, "cheese", 78);
        assertThat(item.getDescription(), is("cheese"));
    }

    @Test
    public void canGetItemID() {
        Item anItem = new Item(50, "cheese", 2);
        assertThat(anItem.getId(), is(2));
    }

}