package katas.katas.ShoppingKata;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;

public class ShoppingKataTest {

    @Test
    void priceOfFreeProductsAlwaysZero() {
        FreeProduct freeProduct = new FreeProduct("parsil");
        assertThat(freeProduct.getPrice(), equalTo(0.0) );
    }

    @Test
    void allProductsHaveNameAndPrice() {
       Product product1 = new Product("onions", 1.5);
        assertThat(product1, hasProperty("name"));
        assertThat(product1, hasProperty("price"));
    }

    @Test
    void discountCanBeSetToFoodProduct(){
        FoodProduct product = new FoodProduct("onions", 10.0);
        product.setDiscount(5.0);
        assertThat(product.getDiscount(), equalTo(5.0));
    }

    @Test
    void priceOfFoodProductWithoutDiscountIsOriginalPrice(){
        FoodProduct product = new FoodProduct("onions", 1.5);
        product.setDiscount(0.0);
        product.applyDiscount();
        assertThat(product.getPrice(), equalTo(1.5));
    }

    @Test
    void priceOfFoodProductWithDiscountIsApplied() {
        FoodProduct product = new FoodProduct("onions", 10.0);
        product.setDiscount(5.0);
        product.applyDiscount();
        assertThat(product.getPrice(), equalTo(9.5));
    }

    @Test
    void shoppingKartHasProductsAndItsPriceIsTheSumOfPricesWithDiscounts() {
        ShoppingKart shoppingKart = new ShoppingKart();
        FoodProduct foodProduct = new FoodProduct("apple", 10.0);
        FreeProduct freeProduct = new FreeProduct("parsil");
        FoodProduct pizza = new FoodProduct("pizza", 10.0);

        shoppingKart.addProduct(foodProduct);
        shoppingKart.addProduct(freeProduct);
        shoppingKart.addProduct(pizza);
        pizza.setDiscount(50.0);
        pizza.applyDiscount();
        foodProduct.setDiscount(5.0);
        foodProduct.applyDiscount();

        assertThat(shoppingKart.totalPrice(), equalTo(14.5));
    }

    @Test
    void bookProductDiscountCantBeHigherThan10(){
        BookProduct book = new BookProduct("anomalia", 10.0);

        book.setDiscount(50.0);
        book.applyDiscount();

        assertThat(book.getPrice(), equalTo(9.0));

    }
}
