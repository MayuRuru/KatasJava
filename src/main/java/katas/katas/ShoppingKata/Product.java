package katas.katas.ShoppingKata;

public class Product {
    private String name;
    private Double price;
    private Double discount;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }
}
