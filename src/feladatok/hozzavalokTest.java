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
public class hozzavalokTest {

    /*
paradicsom;4
paprika;3
zeller;5
paradicsom;4
paprika;5
     */

    public static void main(String[] args) {

        List<hozzavalok> h = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String[] d = sor.split(";");

            String nev = d[0];
            int db = Integer.parseInt(d[1]);
            boolean isIn = false;
            
            if (h.size() == 0) {
                h.add(new hozzavalok(nev, db));
                isIn = true;
            } else {
                for (int i = 0; i < h.size(); i++) {
                    if (h.get(i).getZoldseg().equals(nev)) {
                        h.get(i).setDb(h.get(i).getDb() + db);
                        isIn = true;
                    }
                }
            }
            if (!isIn) {
                h.add(new hozzavalok(nev, db));
            }
            sor = sc.nextLine();
        }

        Collections.sort(h);
        for (hozzavalok i : h) {
            System.out.println(i);
        }
    }

}
