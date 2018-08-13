package Factory_Figure;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ConcreteFigureCreator concreteCreator = new ConcreteFigureCreator();
        ArrayList<IFigure> listOfFigures = new ArrayList<IFigure>();
        
        listOfFigures.add(concreteCreator.createCircle(34));
        listOfFigures.add(concreteCreator.createRectangle(2, 5));

        listOfFigures.forEach((figureInList) -> {
            System.out.println("Perimeter of: " + 
                    figureInList.getTypeOfFigure() + 
                    " = " + figureInList.getPerimeter());
        });
        
        listOfFigures.forEach((figureInList) -> {
            System.out.println("Surface of: " + 
                    figureInList.getTypeOfFigure() + 
                    " = " + figureInList.getSurface());
        });

    }

}