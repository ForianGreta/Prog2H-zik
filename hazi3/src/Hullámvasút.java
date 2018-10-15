/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Hullámvasút {
    private String hullámvasút_neve;
    private String világ_neve;
    private int legkisebb_magasság;
    private int várakozási_idő;

    public Hullámvasút(String hullámvasút_neve, String világ_neve, int legkisebb_magasság, int várakozási_idő) {
        this.hullámvasút_neve = hullámvasút_neve;
        this.világ_neve = világ_neve;
        this.legkisebb_magasság = legkisebb_magasság;
        this.várakozási_idő = várakozási_idő;
    }

    public String getHullámvasút_neve() {
        return hullámvasút_neve;
    }

    public String getVilág_neve() {
        return világ_neve;
    }

    public int getLegkisebb_magasság() {
        return legkisebb_magasság;
    }

    public int getVárakozási_idő() {
        return várakozási_idő;
    }

    @Override
    public String toString() {
        return   hullámvasút_neve + "(" + világ_neve + "):" +várakozási_idő;
    }
    
}
