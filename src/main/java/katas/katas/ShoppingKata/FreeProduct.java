package katas.katas.ShoppingKata;

public class FreeProduct extends Product{
    private String name;
    private Double price;

    public FreeProduct(String name) {
       this.name = name;
       this.price = 0.0;
    }

    public Double getPrice() {
        return price;
    }

}
