package Factory_Food;

//  The abstract-class "Shop" is the creator.
abstract class Shop {

    Product product;
    String className = getClass().getSimpleName();

    //  All childs must implement this function.
    abstract void createProduct();

    void takeOrder() {
        System.out.println("Here is " + this.className + ": please order, now!");
    }

    void serveProduct() {
        System.out.println("Enjoy your meal - your " + this.className);
    }

    void deliverProduct() {
        takeOrder(); createProduct(); serveProduct();
    }
}

class PizzaShop extends Shop {

    @Override
    public void createProduct() {
        this.product = new Pizza();
    }
    
}

class PommesShop extends Shop {

    @Override
    public void createProduct() {
        this.product = new Pommes("Ketchup");
    }
}