package katas.katas.ShoppingKata;

public class FoodProduct extends Product implements Discount{
    private Double discount;

    public FoodProduct(String name, double price){
        super(name,price);
    }

    public Double getDiscount(){
        return discount;
    }

    public  void setDiscount(Double discount){
        this.discount = discount;
    }

    public Double getPrice(){
        return price;
    }

   public void applyDiscount(){
        this.price = price - ((price/100)*discount);
   }

}
