package SimpleFactory;

class Volvo extends Car {

    Volvo() {}

    public Volvo(String newType, int newPS) {
        super(newType, newPS);
    }

    public String getInfo() {
        return "super saftey car";
    }

    @Override
    public String toString() {
        return "Volvo: " + super.toString();
    }
}

class Opel extends Car {

    Opel() {}

    public Opel(String newType, int newPS) {
        super(newType, newPS);
    }

    @Override
    public String toString() {
        return "Opel: " + super.toString();
    }
}

class Fiat extends Car {

    Fiat() {}

    public Fiat(String newType, int newPS) {
        super(newType, newPS);
    }

    @Override
    public String toString() {
        return "FIAT: " + super.toString();
    }

}
