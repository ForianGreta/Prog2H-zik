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
public class Gyumolcsle extends Ital{
    public Gyumolcsle(Gyumolcs gy){
        
    }
    public String mibolFacsartak(){
        return mibolKeszult();
    }

    @Override
    public String mibolKeszult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String milyenIzu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Gyumolcsle" ;
    }
    
}
