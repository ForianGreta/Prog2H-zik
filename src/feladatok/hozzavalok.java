/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;



/**
 *
 * @author Gréta
 */
public class hozzavalok implements Comparable<hozzavalok> {

    private String zoldseg;
    private int db;
  

    public hozzavalok(String zoldseg, int db) {
        this.zoldseg = zoldseg;
        this.db = db;
    }

    public String getZoldseg() {
        return zoldseg;
    }

    public void setZoldseg(String zoldseg) {
        this.zoldseg = zoldseg;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return zoldseg + ":" + db;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hozzavalok)) {
            return false;
        } else {
            hozzavalok h = (hozzavalok) obj;
            return this.zoldseg.equals(h.getZoldseg());
        }
    }

    @Override
    public int compareTo(hozzavalok o) {
        if(this.db==o.getDb()){
            return this.zoldseg.compareTo(o.getZoldseg());        
    }
        else{
            return Integer.compare(o.getDb(),this.db);
        }
    }

    
}

     

