/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

/**
 *
 * @author Gréta
 */
public class Hallgato extends Szemely {

    private double atlag;

    public Hallgato(String nev, int eletkor, boolean ferfi, double atlag) {
        super(nev, eletkor, ferfi);
        this.atlag = atlag;
    }

    @Override
    public String toString() {
        return nev + "\n" + eletkor + "\n" + super.isFerfi() + "\n" + atlag;
    }

    public boolean joE() {
        if (atlag >= 4) {
            return true;
        } else {
            return false;
        }
    }

}
