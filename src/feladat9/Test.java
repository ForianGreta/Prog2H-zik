/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Gréta
 */
public class Test {

    public static void kiir(List<Hatizsak> lista) {
        
        for( Hatizsak i : lista){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        List<Hatizsak> ht = new ArrayList<>();
        ht.add(new Hatizsak("adidas", 50, 3, true));
        ht.add(new Hatizsak("nike", 60, 4, true));
        ht.add(new Hatizsak("nike", 60, 5, true));
        ht.add(new Hatizsak("heawytools", 50, 3, false));
        ht.add(new Hatizsak("puma", 100, 20, false));
        Collections.sort(ht);                
        kiir(ht);
    }
}
