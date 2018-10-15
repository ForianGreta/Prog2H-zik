
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
public class TestHullámvasút {
    private static Hullámvasút hm[];
    
    public static void rendez(Hullámvasút[] h){
        for(int i=0; i<h.length-1;i++){
            for(int j=i+1;j<h.length;j++){
                if(h[i].getVárakozási_idő()>h[j].getVárakozási_idő()){
                    Hullámvasút tmp=h[i];
                    h[i]=h[j];
                    h[j]=tmp;
                }
                else if(h[i].getVárakozási_idő()==h[j].getVárakozási_idő()){
                    if(h[i].getLegkisebb_magasság()==h[j].getLegkisebb_magasság()){
                       if(h[i].getHullámvasút_neve().compareTo(h[j].getHullámvasút_neve())>0) 
                        {
                            Hullámvasút tmp=h[i];
                            h[i]=h[j];
                            h[j]=tmp;
                        }
                        else if(h[i].getLegkisebb_magasság() < h[j].getLegkisebb_magasság()){
                           Hullámvasút tmp=h[i];
                            h[i]=h[j];
                            h[j]=tmp;
                       }
                    }
                }
            }
        }
    }
     public static void kiir(Hullámvasút[] h){
        for(int i=0;i<h.length;i++){
            System.out.println(h[i].toString());
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        hm = new Hullámvasút[n];
        for (int i = 0; i < n; i++) {
            String sor = sc.nextLine();

            String st[] = sor.split(";");
            

            hm[i] = new Hullámvasút(st[0], st[1], Integer.parseInt(st[2]), Integer.parseInt(st[3]));
            
        }
        rendez(hm);
        kiir(hm);
        

    }
}
