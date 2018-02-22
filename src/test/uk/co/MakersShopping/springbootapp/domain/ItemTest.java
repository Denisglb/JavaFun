package uk.co.MakersShopping.springbootapp.domain;

import org.junit.jupiter.api.Test;
import uk.co.MakersShopping.springbootapp.domain.Item;

import static org.hamcrest.CoreMatchers.describedAs;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ItemTest {
    @Test
    public void canCreateItemWithDescriptionAndPrice(){
        Item item = new Item(3,"cheese");
    }


    @Test
    public void canGetItemPrice(){
        Item item = new Item(100, "Cake");
        assertThat(item.getPrice(), is(100));

    }

    @Test
    public void canGetItemDescription(){
        Item item = new Item(4, "cheese");
        assertThat(item.getDescription(), is("cheese"));
    }


}