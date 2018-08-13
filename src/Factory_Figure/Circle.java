/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Figure;

public class Circle implements IFigure {
    
    private final double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public double getSurface() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getTypeOfFigure() {
        return "Circle";
    }
    
}