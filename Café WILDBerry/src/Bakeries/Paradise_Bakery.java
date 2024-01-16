package Bakeries;

import Baked_Goods.BakedGood;

public class Paradise_Bakery implements Bakery {
    private BakedGood bakedgood;

    public Paradise_Bakery(BakedGood bakedgood){
        this.bakedgood = bakedgood;
    }

    @Override
    public void serve(){
        System.out.println("--------Paradise Bakery--------");
        bakedgood.bake();
    }
}