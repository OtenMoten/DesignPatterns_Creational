package Factory_Figure;

public class ConcreteFigureCreator extends AbstractFigureCreator {

    @Override
    public IFigure createRectangle(double newWidth, double newHeight) {
        return new Rectangle(newWidth, newHeight);
    }

    @Override
    public IFigure createCircle(double radius) {
        return new Circle(radius);
    }

}