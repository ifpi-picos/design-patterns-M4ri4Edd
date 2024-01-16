import java.util.Scanner;

import Baked_Goods.Baguette;
import Baked_Goods.BakedGood;
import Baked_Goods.Cake;
import Baked_Goods.Macaroon;
import Bakeries.Bakery;
import Bakeries.Café_WIlDBerrY;
import Bakeries.Paradise_Bakery;
import Drinks.Coffee;
import Drinks.Drink;
import Drinks.Lemonade;
import Drinks.Tea;

public class App {
    public static void main(String[] args) throws Exception {
        Drink limonada = new Lemonade();
        Drink cafe = new Coffee();
        Drink cha = new Tea();

        BakedGood cake = new Cake();
        BakedGood bread = new Baguette();
        BakedGood macaroon = new Macaroon();

        Scanner scanner = new Scanner(System.in);
        System.out.println("O dia está otimo. Voce esta passeando\npela cidade, quando de repente...");
        System.out.println("1. Voce sente sede\n2. Voce sente fome");
        int opt = scanner.nextInt();
        if (opt == 1){
            System.out.println("Mmm..., Tem uma cafeteria aqui perto, vamos até lá!\n o que sera que eu devo pedir quando chegar la???");
            System.out.println("1. Uma Limonada Refrescante\n2. Um Cafe Revigorante\n3. Um Cha Calmante");
            int opcao = scanner.nextInt();
            if(opcao == 1){
                Bakery cafeteria = new Café_WIlDBerrY(limonada);
                cafeteria.serve();
            } else if (opcao == 2){
                Bakery cafeteria = new Café_WIlDBerrY(cafe);
                cafeteria.serve();
            } else if (opcao == 3){
                Bakery cafeteria = new Café_WIlDBerrY(cha);
                cafeteria.serve();
            }
        } else if (opt == 2){
            System.out.println("Mmm..., Tem uma padaria aqui perto, vamos até lá!\n o que sera que eu devo pedir quando chegar la???");
            System.out.println("1. Uma fatia de bolo\n2. Uma Baguette quentinha\n3. Macaroons pra animar");
            int opcao = scanner.nextInt();
            if(opcao == 1){
                Bakery padaria = new Paradise_Bakery(cake);
                padaria.serve();
            } else if (opcao == 2){
                Bakery padaria = new Paradise_Bakery(bread);
                padaria.serve();
            } else if (opcao == 3){
                Bakery padaria = new Paradise_Bakery(macaroon);
                padaria.serve();
            }
        }
    }
}
