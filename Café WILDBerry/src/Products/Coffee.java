package Products;

public class Coffee implements Product {
    @Override
    public void prepare(){
        System.out.println("A Barista esta preparando o Cafe");
    }
}
