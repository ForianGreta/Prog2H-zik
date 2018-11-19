/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gréta
 */
/*
ABC123 80 true
XYZ876 55 false
TIR666 130 true 25000
PQR111 125 false 20000
 */
public class Main {

    public static List<Teherauto> teherbiras(Auto[] t) {
        List<Teherauto> li = new ArrayList<>();
        int a = 20;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Teherauto) {
                Teherauto teher = (Teherauto) t[i];
                String rendszam = teher.getRendszám();
                int teljesitmeny = teher.getTeljesítmény();
                boolean automata = teher.isAutomata();
                int teherbiras = teher.getTeherbírás();
                if (teherbiras > a) {
                    li.add(new Teherauto(rendszam, teljesitmeny, automata, teherbiras));
                }
            }
        }
        return li;
    }

    public static List<Auto> teljesítmeny(List<Auto> a) {
        List<Auto> li = new ArrayList<>();
        Collections.sort(a);
        if (a.size() < 3) {
            for (int i = 0; i < a.size(); i++) {
                li.add(a.get(i));
            }
        } else {
            for (int i = 0; i < 3; i++) {
                li.add(a.get(i));
            }
        }
        return li;
    }

    public static void main(String[] args) {
        List<Auto> valami= new ArrayList<>();
        valami.add(new Auto("dyfg", 1000, true));
        valami.add(new Auto("xfbvd", 2000, true));
        valami.add(new Auto("dfb", 500, true));
        valami.add(new Auto("dfgh", 520, true));
        
        Auto[] au = new Auto[4];
        Scanner sc = new Scanner(System.in);
        String rendszam = sc.nextLine();
        Auto a = new Auto(rendszam, 100, true);
        System.out.println(a.SzabalyosE());
        
        for (int i = 0; i < 2; i++) {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            au[i] = new Auto(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]));

        }
        for (int i = 2; i < 4; i++) {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            au[i] = new Teherauto(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Integer.parseInt(st[3]));
        }

        for (Auto i : au) {
            System.out.println(i);
        }
        System.out.println("\n20-nál nagyobb teherbírású teherautók: ");
        List<Teherauto> teher = teherbiras(au);
        for (Teherauto i : teher) {
            System.out.println(i);
        }
        System.out.println("\nhárom legnagyobb teljesítményű autó: ");
        List<Auto> auto=teljesítmeny(valami);
        for (Auto i : auto) {
            System.out.println(i);
        }
    }
}
