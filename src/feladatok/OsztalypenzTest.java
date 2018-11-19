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
Pisti;500
Feri;1000
Peti;200
Feri;300
Pisti;800
*/
public class OsztalypenzTest {

    public static void main(String[] args) {
        List<Osztalypenz> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] st = sor.split(";");
            String nev = st[0];
            boolean isIn = false;
            int penz = Integer.parseInt(st[1]);

            if (sor.length() == 0) {
                li.add(new Osztalypenz(nev, penz));
                isIn = true;
            } else {
                for (int i = 0; i < li.size(); i++) {
                    if (li.get(i).getNev().equals(nev)) {
                        li.get(i).setPenz(li.get(i).getPenz()+penz);
                        isIn=true;
                    }
                    
                }
            }
            if(!isIn){
                li.add(new Osztalypenz(nev, penz));
            }
            sor=sc.nextLine();
        }
        Collections.sort(li);
        for(Osztalypenz i: li){
            System.out.println(i);
        }
    }
}
