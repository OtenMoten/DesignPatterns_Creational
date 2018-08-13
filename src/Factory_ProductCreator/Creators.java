package Factory_ProductCreator;

class CreatorA extends ACreator {

    @Override
    protected AProduct factoryMethod() {

        AProduct product_a = new ProductA();
        
        return product_a;
        
    }
    
}

class CreatorB extends ACreator {

    @Override
    protected AProduct factoryMethod() {

        AProduct product_b = new ProductB();
        
        return product_b;
        
    }
    
}