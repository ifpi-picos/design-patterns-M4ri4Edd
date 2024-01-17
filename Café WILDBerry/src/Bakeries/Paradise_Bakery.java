package Bakeries;

import Products.Product;

public class Paradise_Bakery implements Bakery {
    private Product product;

    public Paradise_Bakery(Product product){
        this.product = product;
    }

    @Override
    public void serve(){
        System.out.println("--------Paradise Bakery--------");
        product.prepare();
    }
}