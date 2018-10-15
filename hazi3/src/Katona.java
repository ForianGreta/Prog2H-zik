/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Katona {
    private int támadó;
    private int védő;

    public int getTámadó() {
        return támadó;
    }

    public void setTámadó(int támadó) {
        this.támadó = támadó;
    }

    public int getVédő() {
        return védő;
    }

    public void setVédő(int védő) {
        this.védő = védő;
    }
    
    public Katona(){
        this.védő=5;
        this.támadó=5;
        
    }
    public Katona(int támadó,int védő){
        this.támadó=támadó;
        this.védő=védő;
    }

    @Override
    public String toString() {
        return "TE:"+this.támadó+"\t"+"VE:"+this.védő;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Katona)){
            return false;
        }
        Katona k=(Katona) obj;
        
        return this.támadó==k.getTámadó() && this.védő==k.getVédő();
    }
    
    
}
