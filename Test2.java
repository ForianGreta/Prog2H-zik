/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Test2 {

    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5, 1);
        t.setColor("yellow");
        System.out.println(t);
        System.out.println("terület: " + t.getArea() + ", kerület: " + t.getPerimeter() +
                ", szín: " + t.getColor() + ", kitöltés: " + t.isFilled());

    }
}
