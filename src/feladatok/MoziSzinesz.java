/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Gréta
 */
public class MoziSzinesz implements Comparable<MoziSzinesz>{
    private String nev;
    private List<MoziFilm> film;

    public MoziSzinesz(String nev) {
        this.nev = nev;
        this.film=new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<MoziFilm> getFilm() {
        return film;
    }

    public void setFilm(List<MoziFilm> film) {
        this.film = film;
    }

      @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nev).append(":\n");
        Collections.sort(film); // rendez
        for (int i = 0; i < film.size(); i++) {
            
            if (i < film.size() - 1) {
                sb.append(film.get(i)).append("\n");
            } else {
                sb.append(film.get(i));
            }

        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj == null || !(obj instanceof MoziSzinesz)){
           return false;
       }
       else{
           MoziSzinesz m=(MoziSzinesz)obj;
           return this.nev.equals(m.getNev());
       }
    }

    @Override
    public int compareTo(MoziSzinesz o) {
        return (-1)*Integer.compare(this.film.size(), o.getFilm().size());
    }
    
    
    
    
}
