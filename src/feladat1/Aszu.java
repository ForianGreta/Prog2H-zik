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
public class Aszu extends Bor{
    private int puttyonySzam;

    public Aszu(int p, String t,  double a) {
        super("", t, "", a);
        this.puttyonySzam=p;
    }
       public int hanyPuttonyos(){
        return puttyonySzam;
    }

    @Override
    public String toString() {
        return  puttyonySzam + " " + super.holTermett() + " " + super.mennyiAlkoholtTartalmaz();
    }
}
