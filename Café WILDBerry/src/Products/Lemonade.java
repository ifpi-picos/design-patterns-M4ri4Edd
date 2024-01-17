package Products;

public class Lemonade implements Product {
    @Override
    public void prepare(){
        System.out.println("A Barista esta preparando a Limonada");
    }
}