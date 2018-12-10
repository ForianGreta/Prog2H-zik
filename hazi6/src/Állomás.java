
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiba
 */
public class Állomás {
    
    private String azonosító;
    private String felvétel;

    public Állomás(String azonosító, String felvétel) {
        this.azonosító = azonosító;
        this.felvétel = felvétel;
    }

    public String getAzonosító() {
        return azonosító;
    }

    public String getFelvétel() {
        return felvétel;
    }
    
    public List<Integer> oroszanÜvöltésPoz()
    {
          List<Integer> l= new ArrayList<>();
        for (int i=0;i<this.felvétel.length();i++)
        {
        if(this.felvétel.charAt(i)=='O')
            l.add(i);
            
        
        
        }
    
    return l;
    }
    
}
