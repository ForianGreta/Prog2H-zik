
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class SzótárTest {

    private static Szótár szt[];

    public static void rendez(Szótár[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getAngol().compareTo(t[j].getAngol()) > 0) {
                    Szótár tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                } else if (t[i].getAngol().equals(t[j].getAngol())) {
                    if (t[i].getMagyar().compareTo(t[j].getMagyar()) > 0) {
                        Szótár tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }
                }
            }
        }
    }
    public static void kiir(Szótár[] t){
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        szt= new Szótár[n];
        for(int i=0;i<n;i++){
            String sor= sc.nextLine();
            String st[]=sor.split(":");
            szt[i]=new Szótár(st[0], st[1]);
        }
        rendez(szt);
        kiir(szt);
    }
}
