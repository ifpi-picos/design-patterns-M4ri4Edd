package Products;

public class Cake implements Product {
    @Override
    public void prepare(){
        System.out.println("O bolo esta no forno!");
    }
}
