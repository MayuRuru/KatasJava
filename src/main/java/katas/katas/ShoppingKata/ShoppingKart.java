package katas.katas.ShoppingKata;
import java.util.ArrayList;
import java.util.List;


public class ShoppingKart {
    List<Product> shoppingProducts = new ArrayList<>();
    private double total = 0.0;

    public ShoppingKart() {
    }


    public void addProduct(Product product){
        shoppingProducts.add(product);

    }

    public double totalPrice() {
       for ( Product product: shoppingProducts) {
           total += product.getPrice();
       } return total;
    }
}
