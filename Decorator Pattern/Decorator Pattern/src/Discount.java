public class Discount extends AddOns{
    public Discount(Chocolate drinksCost){
        super(drinksCost);
    }
    @Override
    public double cost() {
        return super.drink.cost() - super.drink.cost()*0.05;
    }
}
