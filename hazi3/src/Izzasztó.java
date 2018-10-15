/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Izzasztó {
    private String név;
    private int fok;

    public Izzasztó(String név, int fok) {
        this.név = név;
        this.fok = fok;
    }

    public String getNév() {
        return név;
    }

    public int getFok() {
        return fok;
    }

    @Override
    public String toString() {
        return  név + " (" + fok + ")";
    }
}
