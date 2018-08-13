package SimpleFactory;

public class Client {

    public static void main(String[] args) {

        // CarFactory_1 carFactory_1 = new CarFactory_1();
        // CarFactory_2 carFactory_2 = new CarFactory_2();
        CarFactory_3 carFactory_3 = new CarFactory_3();

        Car carVolvo = carFactory_3.createCar("Volvo", "S60", 205);
        System.out.println(carVolvo);
        System.out.println(((Volvo) carVolvo).getInfo());

        Car carOpel = carFactory_3.createCar("Opel", "Corsa", 65);
        System.out.println(carOpel);

        Car carFiat = carFactory_3.createCar("Fiat", "Panda", 66);
        System.out.println(carFiat);

    }

}
