package feladat2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gréta
 */
public class SzeszesItal extends Ital{
    private double alkoholTartalom;

    public SzeszesItal(String nev, String kiszereles, int ar, double alkoholTartalom) {
        super(nev, kiszereles, ar);
        this.alkoholTartalom=alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return alkoholTartalom + "% alkoholtartalmú " + super.toString();
    }
    
    
    

   
    
}
