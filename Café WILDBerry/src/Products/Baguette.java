package Products;

public class Baguette implements Product {
    @Override
    public void prepare(){
        System.out.println("A Baguette esta no forno!");
    }

}
