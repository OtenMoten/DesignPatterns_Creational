package SimpleFactory;

public class CarFactory_2 {

    Car createCar(String newBrand, String newType, int newPS) {

        Car myNewCar = null;
        try {

            String myStringPackage = getClass().getPackage().getName();
            Class myClass = Class.forName(myStringPackage + "." + newBrand);
            
            //  Create a car without attributes because we have NO constructor
            myNewCar = (Car) myClass.newInstance();
            //  Define attributes one step later via direct access to the values
            myNewCar.type = newType;
            myNewCar.ps = newPS;

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException objException) {
            System.out.println("Fehler " + objException.getMessage());
        }

        return myNewCar;
    }

}
