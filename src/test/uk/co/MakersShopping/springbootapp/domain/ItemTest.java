package uk.co.MakersShopping.springbootapp.domain;

import org.junit.jupiter.api.Test;
import uk.co.MakersShopping.springbootapp.domain.Item;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ItemTest {
    @Test
    public void canCreateItemWithDescription(){
        Item item = new Item("cheese");
    }

    @Test
    public void canCreateItemWithPrice(){
        Item item = new Item(100);
    }

    @Test
    public void canGetItemPrice(){
        Item item = new Item(100);
        assertThat(item.getPrice(), is(100));
    }

    @Test
    public void canGetItemDescription(){
        Item item = new Item("cheese");
        assertThat(item.getDescription(), is("cheese"));
    }


}