
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Posta{

    private String cimzett_neve;
    private int iranyitoszam;
    private String telepules;
    private String utca;
    private int hazszam;
    private int ertek;

    public Posta(String cimzett_neve, int iranyitoszam, String telepules, String utca, int hazszam, int ertek) {
        this.cimzett_neve = cimzett_neve;
        this.iranyitoszam = iranyitoszam;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.ertek = ertek;
    }

    public String getCimzett_neve() {
        return cimzett_neve;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public String getTelepules() {
        return telepules;
    }

    public String getUtca() {
        return utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public int getErtek() {
        return ertek;
    }

    @Override
    public String toString() {
        return "cimzett_neve=" + cimzett_neve + ", iranyitoszam=" + iranyitoszam + ", telepules=" + telepules + ", utca=" + utca + ", hazszam=" + hazszam + ", ertek=" + ertek ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj== null || !(obj instanceof Posta)){
           return false;
       }
       else{
           Posta p=(Posta)obj;
           return this.iranyitoszam==p.getIranyitoszam();
       }
    }
    
    
    
}
