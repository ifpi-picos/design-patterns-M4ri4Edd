package Drinks;

public class Coffee implements Drink {
    @Override
    public void prepare(){
        System.out.println("A Barista esta preparando o Cafe");
    }
}
