/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gréta
 */
public class Molekula {

    private String vegyjel;
    private String elemnev;
    private String molekula;
    private List<String> vegyjel2 = new ArrayList();

    public Molekula(String vegyjel, String elemnev) {
        this.vegyjel = vegyjel;
        this.elemnev = elemnev;

    }

    public Molekula(String molekula, List<String> vegyjel2) {
        this.molekula = molekula;
        this.vegyjel2 = vegyjel2;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getElemnev() {
        return elemnev;
    }

    public void setElemnev(String elemnev) {
        this.elemnev = elemnev;
    }

    public String getMolekula() {
        return molekula;
    }

    public void setMolekula(String molekula) {
        this.molekula = molekula;
    }

    public List<String> getVegyjel2() {
        return vegyjel2;
    }

    public void setVegyjel2(List<String> vegyjel2) {
        this.vegyjel2 = vegyjel2;
    }

    @Override
    public String toString() {
        return "vegyjel=" + vegyjel + ", elemnev=" + elemnev + ", molekula=" + molekula + ", vegyjel2=" + vegyjel2;
    }

}
