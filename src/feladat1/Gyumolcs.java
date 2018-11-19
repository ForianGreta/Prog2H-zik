package feladat1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String f, String i) {
        this.fajta = f;
        this.iz = i;
    }
       
    public String milyenFajtaju(){
        return fajta;
    }
    public String milyenIzu(){
        return iz;
    }

    @Override
    public String toString() {
        return "fajta=" + fajta + ", iz=" + iz;
    }
    
}
