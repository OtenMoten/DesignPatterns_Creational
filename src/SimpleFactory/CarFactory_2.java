package SimpleFactory;

public class CarFactory_2 {

    Car createCar(String newBrand, String newType, int newPS) {

        //  works also
        //  if (newBrand.equals("volvo")) myNewCar = new Volvo(newType, newPS);
        //  if (newBrand.equals("opel")) myNewCar = new Opel(newType, newPS);
        //
        //  better method
        Car myNewCar = null;
        try {

            String myStringPackage = getClass().getPackage().getName();
            Class myClass = Class.forName(myStringPackage + "." + newBrand);
            myNewCar = (Car) myClass.newInstance();

            myNewCar.type = newType;
            myNewCar.ps = newPS;

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException objException) {
            System.out.println("Fehler " + objException.getMessage());
        }

        return myNewCar;
    }

}
