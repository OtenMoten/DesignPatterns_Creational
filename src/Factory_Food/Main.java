package Factory_Food;

public class Main {

    public static void main(String[] args) {

        PizzaShop Alfredo = new PizzaShop();
        Alfredo.deliverProduct();
        
        System.out.println("------------------");
        
        PommesShop brunoSnack = new PommesShop();
        brunoSnack.deliverProduct();
        
    }
}
