
import java.util.Date;
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
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés)
    {
     this.név = név;
     this.kiszerelés = kiszerelés;
     this.gyártásiDátum = new Date();
    }
    
    public String getNev()
    {
        return this.név;
    }
    
    public String getKiszereles()
    {
        return this.kiszerelés;
    }
    
    public static int getAr()
    {
        return ár;
    }
    
    public Date getGyartasiDatum()
    {
        return this.gyártásiDátum;
    }
    
    public static void setAr(int a)
    {
        ár=a;
    }

    @Override
    public String toString() {
        return  név + ", " + kiszerelés + ", " + ár + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Ital))
        { return false;}
        Ital i=(Ital) obj;
        return this.név.equals(i.getNev()) && this.kiszerelés.equals(i.getKiszereles()) && this.ár==i.getAr();
        
    }
    
    
    
    public double getÁrEuróban()
    {
        return (this.ár/323);
        
        
    }
    
    
    
}