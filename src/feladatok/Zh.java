/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

/**
 *
 * @author Gréta
 */
public class Zh implements Comparable<Zh>{
       private String nev;
    private int pont;

    public Zh(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return nev + ": " + pont+ " pont" ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Zh)) {
            return false;
        }
        else{
            Zh e=(Zh)obj;
            return this.nev.equals(e.getNev());
        }
        
    } 

    @Override
    public int compareTo(Zh o) {
        if(this.pont==o.getPont()){
            return this.nev.compareTo(o.getNev());
        }
        else{
            return Integer.compare(o.getPont(), this.pont);
        }
    }
}
