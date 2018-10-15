
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
public class IzzasztóTest {
     private static Izzasztó meleg[];

    public static void rendez(Izzasztó[] t) {
        
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getFok() < t[j].getFok()) {
                    Izzasztó tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                } else if (t[i].getFok() == t[j].getFok()) {
                    if (t[i].getNév().compareTo(t[j].getNév()) > 0) {
                        Izzasztó tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }

                }
            }
        }
    }
    public static void van_e(String keresett, Izzasztó[] t){
        int nincs=0;
        for(int i=0;i<t.length;i++){
            if(t[i].getNév().compareTo(keresett)==0){
                nincs=1;
                int index=i;
                for(int j=0;j<t.length;j++){
                    if(t[index].getFok()< t[j].getFok()){
                        System.out.println(t[j].toString());
                    }
                }
            }
        }
        if(nincs==0){
            System.out.println("missing data");
        }
    }
    public static void main(String[] args) {
       int n;
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] st = sor.split(" ");

        n = Integer.parseInt(st[0]);
        String keres = st[1];
        meleg = new Izzasztó[n];

        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            st = sor.split(":");
            meleg[i] = new Izzasztó(st[0], Integer.parseInt(st[1]));

        }
        rendez(meleg);
        van_e(keres, meleg);
        

    }
}
