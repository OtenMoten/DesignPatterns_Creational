package Factory_Figure;

public abstract class AbstractFigureCreator {

    public abstract IFigure createRectangle(double width, double height);

    public abstract IFigure createCircle(double radius);
    
}
