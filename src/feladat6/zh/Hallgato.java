/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6.zh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gréta
 */
public class Hallgato {

    private static int mennyitKeszult;
    private static boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public static Dolgozat dolgozatotIr() {
        int  pontszam;
        if (sokatTanul) {
            Random rand = new Random();
            int n = rand.nextInt(4) + 4;
            pontszam = n * mennyitKeszult;
        } else {
            Random rand2 = new Random();
            int n = rand2.nextInt(6) + 0;
            pontszam = n * mennyitKeszult;
        }
        Dolgozat eredmeny= new Dolgozat(pontszam);
        eredmeny.setPontszam(pontszam);
        return eredmeny;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<n;i++){
            String sor= sc.nextLine();
            String st[]=sor.split(";");
            Hallgato hall=new Hallgato(Integer.parseInt(st[0]), Boolean.parseBoolean(st[1]));
        }
        dolgozatotIr();
    }
    
}
