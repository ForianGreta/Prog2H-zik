/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Circle extends GeometricShape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle( double radius, String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
     return radius*radius*Math.PI;   
    }
    public double getPerimeter()
    {
        return 2*radius*Math.PI;
    }
    public double getDiameter()
    {
        return 2*radius;
    }

   
    
}
