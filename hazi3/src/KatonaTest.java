/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class KatonaTest {

    public static Katona megkuzd(Katona k1, Katona k2) {
        Katona győztesKatona=null;

        if ((k1.getTámadó()-k2.getVédő()) > (k2.getTámadó()-k1.getVédő())) {
            győztesKatona = k1;
        } 
        if ((k1.getTámadó()-k2.getVédő()) < (k2.getTámadó()-k1.getVédő())) {
            győztesKatona = k2;
        }
        if ((k1.getTámadó()-k2.getVédő()) == (k2.getTámadó()-k1.getVédő())) {
            győztesKatona = k1;
        }
        return győztesKatona;
    }

    public static void main(String[] args) {
        Katona k1 = new Katona(10, 20);
        Katona k2 = new Katona(50, 4);
        Katona k3 = new Katona(49, 5);
        System.out.println(k1+" és "+k2+" küzdelme: ");
        System.out.println("győztes: "+ megkuzd(k1, k2)+"\n");
        
        Katona győztesküzd=megkuzd(k1, k2);
        System.out.println(győztesküzd+" és "+k3+" küzdelme: ");
        System.out.println("győztes: "+megkuzd(győztesküzd, k3));
        

    }
}
