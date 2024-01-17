package Products;

public class Tea implements Product {
    @Override
    public void prepare(){
        System.out.println("A Barista esta preparando o Cha");
    }
}