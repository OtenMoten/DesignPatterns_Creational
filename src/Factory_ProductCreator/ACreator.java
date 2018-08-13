package Factory_ProductCreator;

public abstract class ACreator {

    public AProduct createProduct() {
        
        AProduct genericProduct = factoryMethod();

        genericProduct.setState(23);
        genericProduct.prepare();
        
        return genericProduct;
        
    }

    protected abstract AProduct factoryMethod();
    
}