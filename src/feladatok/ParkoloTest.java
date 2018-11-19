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
Debrecen;300.25;20
Budapest;500.0;30;ABC123;CXK962
Miskolc;140.5;2;CGI299
 */
public class ParkoloTest {

    public static void main(String[] args) {

        List<Parkolo> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int e = 0;
        while (sor.length() > 0) {

            String st[] = sor.split(";");
            String nev = st[0];
            double terulet = Double.parseDouble(st[1]);
            int kapacitas = Integer.parseInt(st[2]);
            List<String> rendszam = new ArrayList<>();

            for (int i = 3; i < st.length; i++) {
                rendszam.add(st[i]);
            }
            li.add(new Parkolo(nev, terulet, kapacitas));
            li.get(e).setKapacitas(li.get(e).getKapacitas() - rendszam.size());
            e++;
            sor = sc.nextLine();
        }
        Collections.sort(li);
        for (Parkolo i : li) {
            if (i.getKapacitas() > 2) {
                System.out.println(i);
            }
        }
//            for(int c=0;c<li.size();c++){
//                if(li.get(c).getKapacitas()>2){
//                    System.out.println(li.get(c));
//                }
//            }
    }
}
