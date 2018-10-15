
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
public class TúraTest {
    private static Túra lp[];

    public static int számolKek(Túra l) {
        int fout = 0;
        String jelzes = "K";
        int firstIndex = 0;
        String str = l.getÚtvonalleíró();
        while (firstIndex != -1) {
            firstIndex = str.indexOf(jelzes, firstIndex);
            if (firstIndex != -1) {
                fout++;
                firstIndex = firstIndex + jelzes.length();
            }
        }
        return fout;

    }

    public static int szamolEgyeb(Túra l) {
        int egyeb = 0;
        String[] jelzes = new String[3];
        jelzes[0] = "P";
        jelzes[1] = "Z";
        jelzes[2] = "S";
        int firstIndex = 0;
        String str = l.getÚtvonalleíró();
        while (firstIndex != -1) {
            for (int i = 0; i < 3; i++) {
                firstIndex = str.indexOf(jelzes[i], firstIndex);
                if (firstIndex != -1) {
                    egyeb++;
                    firstIndex = firstIndex + jelzes.length;
                }
            }
        }
        return egyeb;

    }

    public static void rendez(Túra[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (számolKek(t[i]) < számolKek(t[j])) {
                    Túra tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                } else if (számolKek(t[i]) == számolKek(t[j])) {
                    if (szamolEgyeb(t[i]) == szamolEgyeb(t[j])) {
                        if (t[i].getTuristaNeve().compareTo(t[j].getTuristaNeve()) > 0) {
                            Túra tmp = t[i];
                            t[i] = t[j];
                            t[j] = tmp;

                        } else if (szamolEgyeb(t[i]) < szamolEgyeb(t[j])) {
                            Túra tmp = t[i];
                            t[i] = t[j];
                            t[j] = tmp;
                        }
                    }
                }

            }
        }
    }

    public static void kiir(Túra[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].toString());
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        lp = new Túra[n];
        for (int i = 0; i < n; i++) {
            String sor = sc.nextLine();
            String st[] = sor.split(";");
            lp[i] = new Túra(st[0], st[1]);
        }

        rendez(lp);
        kiir(lp);

    }
}
