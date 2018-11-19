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
public class MoziFilm implements Comparable<MoziFilm> {

    private String cim;
    private int gyartas;

    public MoziFilm(String cim, int gyartas) {
        this.cim = cim;
        this.gyartas = gyartas;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getGyartas() {
        return gyartas;
    }

    public void setGyartas(int gyartas) {
        this.gyartas = gyartas;
    }

    @Override
    public String toString() {
        return gyartas+":"+cim;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MoziFilm)) {
            return false;
        } else {
            MoziFilm f = (MoziFilm) obj;
            return this.cim.equals(f.getCim());
        }
    }

    @Override
    public int compareTo(MoziFilm o) {
       if(gyartas==o.getGyartas()){
           return this.cim.compareTo(o.getCim());
       }
       else{
           return Integer.compare(this.gyartas, o.getGyartas());
       }
    }

}
