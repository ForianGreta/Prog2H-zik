/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.Objects;

/**
 *
 * @author Gréta
 */
public class Osztalypenz implements Comparable<Osztalypenz>{
    private String nev;
    private int penz;

    public Osztalypenz(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    @Override
    public String toString() {
        return nev + ";" + penz  ;
    }

    @Override
    public int compareTo(Osztalypenz o) {
        if(o.getPenz()==this.penz){
            return this.nev.compareTo(o.getNev());
        }
        else{
            return Integer.compare(o.getPenz(), this.penz);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj== null || !(obj instanceof Osztalypenz)){
            return false;
        }
        else{
            Osztalypenz op=(Osztalypenz) obj;
            return this.nev.equals(op.getNev());
        }
    }
    
    
}
