package Factory_BMW;

class BWMCar extends Car {

    public BWMCar() {}

    public int getFees() {
        return getPS() * 3;
    }

    @Override
    public String toString() {
        return super.toString() + "  Fees: " + getFees();
    }
}
