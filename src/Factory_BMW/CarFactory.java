package Factory_BMW;

public abstract class CarFactory {

    public Car createCar(String newType, int newPS) {
        
        //  Just create a car waithout attributes.
        Car newCar = createCar();

        //  Enter the attributes at a later time ...
        newCar.setPS(newPS);
        newCar.setType(newType);

        //  Return the new car.
        return newCar;
        
    }

    //  This method must be implemented in all inherited child-classes.
    protected abstract Car createCar();

}