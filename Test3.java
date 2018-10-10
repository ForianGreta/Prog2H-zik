/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Test3 {
    private static Kocsma[] adottItaltÁrusítóKocsmák(String ital, VendéglátóipariEgység[] t)
    {
        int count=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i] instanceof Kocsma)
            {
                Kocsma k=(Kocsma)t[i];
                for(int j=0;j<k.getSörlap().length;j++)
                {
                    if(k.getSörlap()[j].equals(ital))
                    {
                        count++;
                    }
                }
            }
        }
        Kocsma[] kocsma= new Kocsma[count];
        int ind=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i] instanceof Kocsma)
            {
                Kocsma k= (Kocsma) t[i];
                for(int j=0;j<k.getSörlap().length;j++)
                {
                    if(k.getSörlap()[j].equals(ital))
                    {
                       kocsma[ind]=k;
                       ind++;
                    }
                }
            }
        }
        return kocsma;
        
    }
    public static void main(String[] args) {
        VendéglátóipariEgység[] t= new VendéglátóipariEgység[]
        {
          new Étterem("Alma étterem", 100, new String[]{"lecsó", "húsleves", "pörkölt"}),
          new Étterem("Banán étterem", 200, new String[]{"lecsó", "töltöttkáposzta", "bundáskenyér"}),
          new Étterem("Szilva étterem", 150, new String[]{"lecsó", "húsleves", "bundáskenyér"}),
          new Étterem("Körte étterem", 175, new String[]{"pörkölt", "töltöttkáposzta", "szilvaleves"}),
          new Étterem("Citrom étterem", 150, new String[]{"pörkölt", "szilvaleves"}),
          new Kocsma("Vodka kocsma", 20, new String[]{"vodka", "sör", "pálinka"}),
          new Kocsma("Bor kocsma", 15, new String[]{"bor", "sör", "pálnika"}),
          new Kocsma("Sör kocsma", 50, new String[]{"sör"}),
          new Kocsma("Pálinka kocsma", 30, new String[]{"bor", "pálika"}),
          new Kocsma("Whiskey kocsma", 20, new String[]{"bor", "pálinka"})
        };
        Kocsma[] kocsm=adottItaltÁrusítóKocsmák("bor", t);
        for(Kocsma k:kocsm){
        System.out.println(k);}
    }
}
