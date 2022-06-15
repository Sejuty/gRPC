public class Chocolate extends AddOns{
    public Chocolate(Sugar drinksCost){
        super(drinksCost);
    }
    @Override
    public double cost() {
        return super.drink.cost()+50.0;
    }
}
