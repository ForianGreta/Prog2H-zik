/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gréta
 */
/*
5425903142657353
5425903142657354
 */
public class BankkartyaTest {

    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            for (int i = 0; i < sor.length(); i++) {
                int szam = Integer.parseInt("" + sor.charAt(i));
                li.add(szam);
            }
            sor = sc.nextLine();
        }
        int ossz = 0;

        for (int i = 0; i < li.size(); i++) {
            if (i % 2 == 0) {
                li.set(i, li.get(i) * 2);

                if (li.get(i) > 9) {
                    li.set(i, li.get(i) - 9);
                }
                ossz = ossz + li.get(i);
            } else {
                ossz = ossz + li.get(i);
            }

        }

        if (ossz % 10 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
