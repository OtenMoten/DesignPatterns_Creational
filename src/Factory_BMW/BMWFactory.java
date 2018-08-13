package Factory_BMW;

//  This class is needed because we don't have a constructor in
//  in the class "CarFactory", only methods.

public class BMWFactory extends CarFactory {

    //  Just creating a car without attributes.
    //  Due the method of the "newBWM"-object which is type of the abstract-class "Car" we
    //  can alter the attributes afterwards.
    @Override
    protected Car createCar() {
        //  We can create a "newBMW"-object which is type of the abstract-class "Car" because
        //  the class "BMWCar" is a child-class of the abstract-class "Car".
        Car newBMW = new BWMCar();
        return newBMW;
    }
    
}