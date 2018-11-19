/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

/**
 *
 * @author Gréta
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return  marka + ", urtartalom=" + urtartalom + ", zsebekSzama=" + zsebekSzama + ", vizhatlan=" + vizhatlan;
    }

    @Override
    public int compareTo(Hatizsak t) {
        if(this.marka.equals(t.getMarka())){
            return Integer.compare(t.zsebekSzama, this.getZsebekSzama());
        }
        else {
            return this.marka.compareTo(t.getMarka());
        }

    }
    
    
    
}
