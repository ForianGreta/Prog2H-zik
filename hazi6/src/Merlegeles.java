
import java.util.ArrayList;
import java.util.List;
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
public class Merlegeles implements Comparable<Merlegeles> {

    private String cegnev;
    private String telephely;
    private int ev;
    private int hanyev;
    private List<Integer> bevetel;

    public Merlegeles(String cegnev, String telephely, int ev) {
        this.cegnev = cegnev;
        this.telephely = telephely;
        this.ev = ev;
        this.bevetel = new ArrayList<>();
    }

    public int getOsszbevetel() {
        int osszbev = 0;
        for (int i = 0; i < bevetel.size(); i++) {
            osszbev = osszbev + bevetel.get(i);
        }
        return osszbev;
    }

    public String getCegnev() {
        return cegnev;
    }

    public String getTelephely() {
        return telephely;
    }

    public int getEv() {
        return ev;
    }

    public List<Integer> getBevetel() {
        return bevetel;
    }

    @Override
    public String toString() {
        return cegnev + " (" + telephely + "):" + getOsszbevetel();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Merlegeles)) {
            return false;
        } else {
            Merlegeles a = (Merlegeles) obj;
            return this.cegnev.equals(a.getCegnev()) && this.telephely.equals(a.getTelephely());
        }
    }

    @Override
    public int compareTo(Merlegeles o) {
        if (this.getOsszbevetel() == o.getOsszbevetel()) {
            if (this.bevetel.size() == o.getBevetel().size()) {
                return this.cegnev.compareTo(o.getCegnev());
            } else {
                return Integer.compare(this.bevetel.size(), o.getBevetel().size());
            }
        } else {
            return -1*Integer.compare(this.getOsszbevetel(), o.getOsszbevetel());
        }
    }

}
