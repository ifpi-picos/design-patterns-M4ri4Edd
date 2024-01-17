package Bakeries;

import Products.Product;

public class Café_WIlDBerrY implements Bakery {
    private Product product;

    public Café_WIlDBerrY(Product product){
        this.product = product;
    }

    @Override
    public void serve(){
        System.out.println("--------Cafe WIlDBerrY--------");
        product.prepare();
    }
}
