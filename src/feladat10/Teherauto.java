/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

/**
 *
 * @author Gréta
 */
public class Teherauto extends Auto {

    private int teherbírás;

    public Teherauto(String rendszám, int teljesítmény, boolean automata, int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás = teherbírás;
    }

    public int getTeherbírás() {
        return teherbírás;
    }

    @Override
    public String toString() {
        return super.toString() + " teherbírás=" + teherbírás;
    }

    @Override
    public boolean equals(Object obj2) {
        if (obj2 == null || !(obj2 instanceof Teherauto)) {
            return false;
        }
        Teherauto t = (Teherauto) obj2;
        return super.equals(t) && this.teherbírás == t.getTeherbírás();
    }

}
