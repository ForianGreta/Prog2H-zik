/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Gréta
 */
public class Parkolo implements Comparable<Parkolo>{

    private String cim;
    private double terulet;
    private int kapacitas;
    private List<String> rendszam;

    public Parkolo(String cim, double terulet, int kapacitas) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = new ArrayList<>();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public List<String> getRendszam() {
        return rendszam;
    }

    public void setRendszam(List<String> rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return cim + ": " + kapacitas + " szabad hely";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Parkolo)) {
            return false;
        } else {
            Parkolo p = (Parkolo) obj;
            return this.cim.equals(p.getCim());
        }

    }

    @Override
    public int compareTo(Parkolo o) {
        if(this.kapacitas==o.getKapacitas()){
            return this.cim.compareTo(o.getCim());
        }
        else{
            return Integer.compare(o.getKapacitas(), this.kapacitas);
        }
    }
}
