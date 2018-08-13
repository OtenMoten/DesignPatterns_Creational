package SimpleFactory;

public abstract class Car {

    String type;
    int ps;

    protected Car() {}

    public Car(String newTyp, int newPS) {
        this.type = newTyp;
        this.ps = newPS;
    }

    @Override
    public String toString() {
        return this.type + "[" + this.ps + "]";
    }

}