package Bakeries;

import Drinks.Drink;

public class Café_WIlDBerrY implements Bakery {
    private Drink drink;

    public Café_WIlDBerrY(Drink drink){
        this.drink = drink;
    }

    @Override
    public void serve(){
        System.out.println("--------Cafe WIlDBerrY--------");
        drink.prepare();
    }
}
