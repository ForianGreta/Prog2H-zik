
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class verseny {
   private Date ideje;
    private String túraNeve;
    private int résztáv;

    public verseny(int év, int hónap, int nap, String túraNeve, int résztáv) {
        
        this.ideje=new Date(év+1900, hónap, nap);
        this.túraNeve = túraNeve;
        this.résztáv = résztáv;
    }

    public Date getIdeje() {
        return ideje;
    }

    public String getTúraNeve() {
        return túraNeve;
    }

    public int getRésztáv() {
        return résztáv;
    }
    

    @Override
    public String toString() {
        return "Kupa{" + "ideje=" + ideje + ", t\u00faraNeve=" + túraNeve + ", r\u00e9szt\u00e1v=" + résztáv + '}';
    }
    

   
    
}
