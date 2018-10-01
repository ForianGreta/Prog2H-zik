/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable()
    {
        if((this.a*this.d-this.b*this.c)!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double getX()
    {
       return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
    }
    public double getY()
    {
        return (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
    }
}
