/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Nyilas extends Katona {
    private int lőtáv;
    public Nyilas(int támadó,int védő,int lőtáv){
        super(támadó,védő);
        this.lőtáv=lőtáv;
    }

    public int getLőtáv() {
        return lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }
    public int getTámadó(){
        return super.getTámadó()+this.lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas:"+"TE:"+getTámadó()+"VE:"+getVédő();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Nyilas)){
            return false;
        }
        Nyilas ny=(Nyilas) obj;
        return super.getTámadó()==ny.getTámadó() && super.getVédő()==ny.getVédő() && this.lőtáv==ny.lőtáv;
        
    }
}
    
    
    
