package Billgenerator;

public class Food {


    private int price;
    private final Boolean nonveg;
    private final int addDessert = 100;
    private final int addColdDrink = 150;
    private final int addeggBiryani = 200;
    private final int Biryaniprice;
    private Boolean isDessertadded = false;
    private Boolean iscoldDrinkadded= false;
    private Boolean isEggBiryaniadded = false;


    public Food(Boolean nonveg) {
        this.nonveg = nonveg;
        if(this.nonveg){
            this.price = 300;
        }
        Biryaniprice = this.price;
    }
    public void addeggBiryani(){
        isEggBiryaniadded = true;
        this.price += addeggBiryani;
    }
    public void addDessert(){
        isDessertadded = true;

        this.price+= addDessert;
    }
    public void addColdDrink(){
        iscoldDrinkadded = true;

        this.price+= addColdDrink;
    }
    public void getBill(){
        String bill = " ";
        System.out.println("Biryani "+Biryaniprice);
        if(isDessertadded){
            bill += "Dessert Added: "+addDessert+ "\n";

        }
        if(iscoldDrinkadded){
            bill += "Cold Drink Added: "+addColdDrink+ "\n";
        }
        if(isEggBiryaniadded){
            bill += "Egg Biryani Added: "+addeggBiryani+ "\n";
        }
        bill += "Bill: "+this.price + "\n";
        System.out.println(bill);

    }
}
