import Bakeries.Bakery;
import Bakeries.Café_WIlDBerrY;
import Bakeries.Paradise_Bakery;
import Products.Baguette;
import Products.Cake;
import Products.Coffee;
import Products.Lemonade;
import Products.Macaroon;
import Products.Product;
import Products.Tea;

public class App {
    public static void main(String[] args) throws Exception {
        Product limonada = new Lemonade();
        Product cafe = new Coffee();
        Product cha = new Tea();

        Product cake = new Cake();
        Product bread = new Baguette();
        Product macaroon = new Macaroon();

        Bakery padaria = new Paradise_Bakery(macaroon);
        padaria.serve();
        
        Bakery cafeteria = new Café_WIlDBerrY(cafe);
        cafeteria.serve();
    }
}
