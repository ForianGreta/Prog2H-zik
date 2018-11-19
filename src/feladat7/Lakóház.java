/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat7;

/**
 *
 * @author Gréta
 */
public class Lakóház implements Comparable<Lakóház> {

    public double emeletMagassag = 3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public Lakóház(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }

    public double legkobmeter() {
        return alapterulet * emeletMagassag * emeletekSzama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cim).append(", ").append(legkobmeter()).append(":\n");

        return sb.toString();
    }

    @Override
    public int compareTo(Lakóház o) {
        return Double.compare(this.legkobmeter(), o.legkobmeter());
    }

}
