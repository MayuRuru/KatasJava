package katas.katas.ShoppingKata;

public class Product {
    public String name;
    public Double price;
    public Double discount;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
