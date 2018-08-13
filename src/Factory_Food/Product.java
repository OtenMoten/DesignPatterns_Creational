package Factory_Food;

public class Product {}

//  Concrete item.
class Pizza extends Product {

    public Pizza() {
        System.out.println("Pizza is backing.");
    }
    
}

//  Concrete item.
class Pommes extends Product {

    public Pommes(String topping) {
        
        System.out.print("Pommes is frying ");
        
        if (!topping.equalsIgnoreCase("")) {
            System.out.println("with " + topping + ".");
        } else {
            System.out.println("without toppings.");
        }
        
    }
    
}