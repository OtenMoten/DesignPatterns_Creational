package Factory_BMW;

public abstract class Car {

    private int ps;
    private String type;

    public Car() {}

    public void setPS(int newPS) {
        this.ps = newPS;
    }

    public int getPS() {
        return this.ps;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.type + " : " + this.ps;
    }

}