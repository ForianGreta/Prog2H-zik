/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Gréta
 */
public class Test {

    public static List<Lakóház> tagasLakohazak(List<Lakóház> lista, double terfogat) {
        List<Lakóház> lh = new ArrayList<>();
        for (Lakóház i : lista) {
            if (i.legkobmeter() > terfogat) {
                lh.add(i);
            }
        }
        return lh;

    }

    public static void main(String[] args) {
        List<Lakóház> li = new ArrayList<>();
        li.add(new Lakóház("dembinszky", 5, 120));
        li.add(new Lakóház("mikes", 1, 100));
        li.add(new Lakóház("katona", 9, 500));
        li.add(new Lakóház("hunyadi", 2, 30));

        
        List<Lakóház> uj = tagasLakohazak(li, 4000);
        Collections.sort(uj);
        for (Lakóház i : uj) {
            System.out.println(i);

        }
    }
}