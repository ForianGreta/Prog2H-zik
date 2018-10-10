/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Teherautó extends Autó {
    private int maxSzállíthatóTeher;
    public Teherautó(String rendszám, int motorteljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, motorteljesítmény);
        this.maxSzállíthatóTeher=maxSzállíthatóTeher;
    }
    public int getMaxSzállíthatóTeher(){
        return this.maxSzállíthatóTeher;
    }    

    @Override
    public String toString() {
        return "rendszám: "+ super.getRendszám() +" motor teljesítménye: " + super.getMotorteljesítmény() + " max szállítható teher: " + maxSzállíthatóTeher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj2) {
        if(obj2==null || !(obj2 instanceof Teherautó))
        return false;
        Teherautó t = (Teherautó) obj2;
        return super.equals(t) && this.maxSzállíthatóTeher==t.maxSzállíthatóTeher;
    }
    
}
