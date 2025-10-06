import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println(shoppingCart.getPriceWithoutDiscount());
        System.out.println(shoppingCart.getPriceWithDiscount());
        System.out.println(shoppingCart.getVegetarian());
    }

}
