/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6.zh;

import feladat6.egyetem.Pontozhato;



/**
 *
 * @author Gréta
 */
public class Dolgozat implements Pontozhato {

    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if (pontszam == -1) {
            System.out.println("nem írt");
            return false;
        }
        if (pontszam > 35) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "pontszam=" + pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }
    
    

}
