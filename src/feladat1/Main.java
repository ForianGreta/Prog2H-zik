package feladat1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Main {

    public static void main(String[] args) {
        Bor[] tomb = new Bor[]{
            new Bor("lila", "eger", "édes", 20),
            new Bor("fehér", "dunántúl", "száraz", 22),
            new Aszu(5, "tokaj", 15),
            new Aszu(7, "tiszantúl", 16),
            new Aszu(5, "eger", 17),
            new Aszu(5, "dunántúl", 18)
        };
        Aszu[] bor = otPuttyonyos(tomb);
        for (Aszu k : bor) {
            System.out.println(k);

        }
    }

    private static Aszu[] otPuttyonyos(AlkoholosItal[] t) {
        int count = 0;
        int a = 5;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Aszu) {
                Aszu k = (Aszu) t[i];
                if (k.hanyPuttonyos() == a) {
                    count++;
                }
            }
        }
        Aszu[] pia = new Aszu[count];
        int ind = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Aszu) {
                Aszu k = (Aszu) t[i];
                if (k.hanyPuttonyos() == a) {
                    pia[ind] = k;
                    ind++;
                }
            }
        }
        return pia;
    }

}