package Billgenerator;

public class Checkout {
    public static void main(String[] args) {

    Food fb = new Food(true);
    fb.addDessert();
    fb.addColdDrink();
    fb.addDessert();
    fb.getBill();

    Combo cb = new Combo(true);
    cb.getBill();
    }
}
