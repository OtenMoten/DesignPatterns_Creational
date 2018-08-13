package Factory_ProductCreator;

public class Client {

    public static void main(String[] args) {
       
        ACreator creator_a = new CreatorA();
        ACreator creator_b = new CreatorB();
        
        AProduct product_a = creator_b.createProduct();
        AProduct product_b = creator_a.createProduct();
        
        System.out.println(product_a.getClass() + " " + product_a.getPrice() + "State is " + product_a.getState());
        System.out.println(product_b.getClass() + " " + product_b.getPrice() + "State is " + product_b.getState());
        
    }
    
}