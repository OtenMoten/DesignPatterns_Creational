package Factory_ProductCreator;

public abstract class AProduct {

    private int state;

    public void prepare() {
        System.out.println("preparing general Product");
    }

    public void setState(int newState) {
        this.state = newState;
    }

    public int getState() {
        return this.state;
    }

    public abstract int getPrice();

}