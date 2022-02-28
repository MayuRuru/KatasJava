package katas.katas.ShoppingKataTest;
import katas.katas.ShoppingKata.FoodProduct;
import katas.katas.ShoppingKata.FreeProduct;
import katas.katas.ShoppingKata.Product;
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

}
