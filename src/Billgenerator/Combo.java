package Billgenerator;

public class Combo extends Food{
    public Combo(Boolean nonveg) {
        super(nonveg);
        super.addeggBiryani();
        super.addDessert();
        super.addColdDrink();
    }

    @Override
    public void addeggBiryani() {}

    @Override
    public void addDessert() {}

    @Override
    public void addColdDrink() {}
}
