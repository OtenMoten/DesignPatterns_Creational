package Factory_BMW;

public class Main {

    public static void main(String[] args) {

        CarFactory BMWFactory = new BMWFactory();

        //  We can create a BMW without attributes through the
        //  inherited function ".createCar()" from the class "BWMFactory" which
        //  has no constrcutor for applying attributes.
        Car z4 = BMWFactory.createCar();
        z4.setPS(400); z4.setType("Z4");
        //  Or we can use the inherited function ".createCar(String newType, int new PS)"
        //  from the abstract-class "CarFactory" which has a constructor.
        Car x3 = BMWFactory.createCar("X3", 333);
        Car f25 = BMWFactory.createCar("f25", 250);

        System.out.println(z4);
        System.out.println(x3);
        System.out.println(f25);

    }

}