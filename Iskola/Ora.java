/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author Gréta
 */
public class Ora {

  public int oraKodja;
    public String neve;
    public int kezdete;
   
   
    
    public Ora(int oraKodja,String neve,int kezdete){
        this.oraKodja=oraKodja;
        this.neve=neve;        
        if(this.kezdete<8){
            this.kezdete=8;
        }
        else if(this.kezdete>12){
            this.kezdete=12;
        }
        else{
            this.kezdete=kezdete;
        }
    }

    public int getOraKodja() {
        return oraKodja;
    }

    public void setOraKodja(int oraKodja) {
        this.oraKodja = oraKodja;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public int getKezdete() {
        return kezdete;
    }

    public void setKezdete(int kezdete) {
        this.kezdete = kezdete;
    }

    @Override
    public String toString() {
        return "Ora:" + "oraKodja=" + oraKodja + ", neve=" + neve + ", kezdete=" + kezdete;
    }

}
