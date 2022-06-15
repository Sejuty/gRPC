public abstract class AddOns extends DrinksCost {
    public DrinksCost drink;
    public AddOns(DrinksCost drink){
        this.drink = drink;
    }

    public abstract double cost();
}
