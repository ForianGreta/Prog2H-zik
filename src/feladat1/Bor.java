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
public class Bor extends AlkoholosItal {
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String sz, String t, String i, double a) {
        super(i, a);
        this.szoloFajta=sz;
        this.termoTerulet=t;
    }
    public  String milyenSzolobolKeszult(){
        return szoloFajta;
    }
    public String mibolKeszult(){
        return mibolKeszult();
    }
    public String holTermett(){
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }
    

    
  
    
}
