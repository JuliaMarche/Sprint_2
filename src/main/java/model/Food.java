package model;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount (){
        return 0.0;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPriceWithoutDiscount() {
        return amount * price;
    }

}
