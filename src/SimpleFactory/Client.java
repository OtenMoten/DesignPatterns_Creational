package SimpleFactory;

public class Client {

    public static void main(String[] args) {

        // CarFactory_1 carFactory_1 = new CarFactory_1();
        // CarFactory_2 carFactory_2 = new CarFactory_2();
        CarFactory_3 carFactory_3 = new CarFactory_3();

        Car v = carFactory_3.erzeugeAuto("Volvo", "S60", 205);
        System.out.println(v);
        System.out.println(((Volvo) v).getInfo());

        Car o = carFactory_3.erzeugeAuto("Opel", "Corsa", 65);
        System.out.println(o);

        Car x = carFactory_3.erzeugeAuto("Fiat", "Panda", 66);
        System.out.println(x);

    }

}
