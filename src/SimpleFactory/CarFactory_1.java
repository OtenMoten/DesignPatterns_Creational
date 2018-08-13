package SimpleFactory;

public class CarFactory_1 {

    Car createCar(String newBrand, String newTyp, int newPS) {

        Car myNewCar = null;
        
        if (newBrand.equalsIgnoreCase("volvo")) {
            myNewCar = new Volvo(newTyp, newPS);
        }

        if (newBrand.equalsIgnoreCase("opel")) {
            myNewCar = new Opel(newTyp, newPS);
        }
        
        return myNewCar;
        
    };
    
}