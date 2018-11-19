/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

import java.util.Scanner;

/**
 *
 * @author Gréta
 */

/*
Gabriella 23 false 3.5
Gabor 22 true 4.2
Peter 36 true Grafika
Andrea 32 false Szamitastudomany
*/
public class Main {
    public static void main(String[] args) {
        Szemely sz1= new Szemely("Mona Lisa", 20, false);
        System.out.println(sz1);
        Scanner sc=new Scanner(System.in);
        Hallgato h=new Hallgato("petike", 20, true, 3.1);
        System.out.println(h.joE());
        
        Szemely[] sz=new Szemely[4];
        for(int i=0;i<2;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            sz[i]=new Hallgato(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Double.parseDouble(st[3]));
        }
        for(int i=2;i<4;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            sz[i]=new Oktato(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), st[3]);
        }
        for(Szemely i:sz){
            System.out.println(i);
        }
    }
}
