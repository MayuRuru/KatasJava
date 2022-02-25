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
       Product product = new Product();
        assertThat(product, hasProperty("name"));
        assertThat(product, hasProperty("price"));
    }

    @Test
    void discountCanBeSetToFoodProduct(){
        FoodProduct product = new FoodProduct();
        product.setDiscount();
    }

}
