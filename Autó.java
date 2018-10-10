
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
public class Autó {
    private String rendszám;
    private int motorteljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorteljesítmény) {
        this.rendszám = rendszám;
        this.motorteljesítmény = motorteljesítmény;
        this.gyártásDátuma = new Date();
        
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorteljesítmény() {
        return motorteljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "rendszám: " + rendszám + " motorteljes\u00edtm\u00e9ny: " + motorteljesítmény + " gy\u00e1rt\u00e1sD\u00e1tuma: " + gyártásDátuma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Autó))
        return false;
        Autó a= (Autó) obj;
        return this.rendszám.equals(a.getRendszám());
    }
    
    
}
