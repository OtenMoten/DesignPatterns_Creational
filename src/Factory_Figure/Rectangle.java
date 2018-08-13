package Factory_Figure;

public class Rectangle implements IFigure {

    private final double width;
    private final double height;

    Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public double getSurface() {
        return this.width * this.height;
    }

    @Override
    public String getTypeOfFigure() {
        return "Rectangle";
    }

}