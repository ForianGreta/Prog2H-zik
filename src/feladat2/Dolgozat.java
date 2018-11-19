package feladat2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Dolgozat {

    public static SzeszesItal[] fuggveny(Ital[] t) {
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof SzeszesItal) {
                SzeszesItal k = (SzeszesItal) t[i];
                count++;
            }
        }
        SzeszesItal[] pia = new SzeszesItal[count];
        int ind = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof SzeszesItal) {
                SzeszesItal k = (SzeszesItal) t[i];
                pia[ind] = k;
                ind++;
            }
        }
    
        for (int i = 0; i < pia.length - 1; i++) {
            for (int j = i + 1; j < pia.length; j++) {
                if(pia[i].getAlkoholTartalom()<pia[j].getAlkoholTartalom()){
                    SzeszesItal tmp=pia[i];
                    pia[i]=pia[j];
                    pia[j]=tmp;
                }
            }
        }
        if(pia.length<3){
           
            SzeszesItal[] eredmeny= new SzeszesItal[1];
            eredmeny[0]=null;
            return eredmeny;
        }
        else{
        SzeszesItal[] eredmeny= new SzeszesItal[3];
        for(int i =0; i<3;i++){
            eredmeny[i]=pia[i];
        }
        return eredmeny;
        }
    }

    public static void main(String[] args) {
        Ital[] t = new Ital[]{
            new Ital("gyumilé", "5 dl", 300),
            new SzeszesItal("bor", "0.7 l", 1500, 17),
            new SzeszesItal("pálinka", "2 dl", 500, 60),
            new SzeszesItal("vondka", "0.7 l", 2000, 30),
            new SzeszesItal("whiskey", "0.5 l", 4000, 40)
        };
        
        SzeszesItal[] kocsm = fuggveny(t);
        for (SzeszesItal k : kocsm) {
            System.out.println(k);
        }
    }
}

