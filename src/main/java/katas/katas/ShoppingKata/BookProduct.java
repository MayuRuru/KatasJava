package katas.katas.ShoppingKata;

public class BookProduct extends Product implements Discount{

    private double discount = 0;

    public BookProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void setDiscount(Double discount) {
        if (discount>10.0) {
            this.discount = 10; return;
        }
        this.discount = discount;
    }

    @Override
    public void applyDiscount() {
        this.price = price - ((price/100)*discount);
    }
}
