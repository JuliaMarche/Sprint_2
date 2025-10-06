package service;
import model.Food;

public class ShoppingCart  {

private Food[] products;

public ShoppingCart(Food[] products) {
    this.products = products;
}

public double getPriceWithoutDiscount() {
    double total = 0;
    for (int i = 0; i < products.length; i++) {
        total += products[i].getPriceWithoutDiscount();
    }
    return total;
}

public double getPriceWithDiscount() {
    double total = 0;
    for (int i = 0; i < products.length; i++) {
        double price = products[i].getPriceWithoutDiscount();
        double discount = products[i].getDiscount();
        total += price * (1 - discount / 100.0);
    }
    return total;
}

public double getVegetarian() {
    double total = 0;
    for (int i = 0; i < products.length; i++) {
        if (products[i].isVegetarian()) {
            total += products[i].getPriceWithoutDiscount();
        }
    }
    return total;
}
}
