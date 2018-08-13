package Factory_ProductCreator;

class ProductA extends AProduct { 

    @Override 
    public int getPrice() { 
        return 1400; 
    } 
   
} 

class ProductB extends AProduct { 

    @Override 
    public int getPrice() { 
        return 2200; 
    } 

} 

class ProductC extends AProduct { 

    @Override 
    public int getPrice() { 
        return 800; 
    }
    
} 	