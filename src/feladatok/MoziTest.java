/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gréta
 */
/*
A tegla (2006):Leonardo DiCaprio,Matt Damon,Jack Nicholson,Mark Wahlberg,Martin Sheen
Eredet (2010):Leonardo DiCaprio,Ken Watanabe,Joseph Gordon-Levitt,Marion Cotillard
Ted (2012):Mark Wahlberg,Mila Kunis,Seth MacFarlane
Kapj el ha tudsz (2002):Leonardo DiCaprio,Tom Hanks,Christopher Walken
Angyalok es demonok (2009):Tom Hanks,Ewan McGregor,Ayelet Zurer
 */
public class MoziTest {

    public static void main(String[] args) {
        List<MoziSzinesz> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] st = sor.split("[():,]");
            for (int i = 3; i < st.length; i++) {
                MoziSzinesz szinesz = new MoziSzinesz(st[i]);
                if(li.contains(szinesz)){
                    li.get(li.indexOf(szinesz)).getFilm().add(new MoziFilm(st[0], Integer.parseInt(st[1])));
                }
                else{
                    szinesz.getFilm().add(new MoziFilm(st[0], Integer.parseInt(st[1])));
                    li.add(szinesz);
                }
            }
            sor=sc.nextLine();
        }
        Collections.sort(li);
        for(MoziSzinesz i: li){
            System.out.println(i);
        }
    }
}
