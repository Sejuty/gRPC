public class Sugar extends AddOns {
    public Sugar(DrinksCost drinksCost){
        super(drinksCost);
    }
    @Override
    public  double cost(){
        return super.drink.cost()+10.0;
    }
}
