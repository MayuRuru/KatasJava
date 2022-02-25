package katas.katas.ShoppingKata;

public class FoodProduct extends Product{
    private Double discount;

    public FoodProduct(String name, Double price){
        super(name,price);
    }

    public Double getDiscount(){
        return discount;
    }

    public  void setDiscount(Double discount){
        this.discount = discount;
    }


}
