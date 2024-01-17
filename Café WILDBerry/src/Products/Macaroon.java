package Products;

public class Macaroon implements Product {
    @Override
    public void prepare(){
        System.out.println("Os Macaroons estao no forno!");
    }
}
