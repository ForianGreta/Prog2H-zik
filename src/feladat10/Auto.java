/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;
import java.util.Objects;

/**
 *
 * @author Gréta
 */
public class Auto implements Comparable<Auto> {

    private String rendszám;
    private int teljesítmény;
    private boolean automata;

    public Auto(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public String getRendszám() {
        return rendszám;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return rendszám + ", teljes\u00edtm\u00e9ny=" + teljesítmény + ", automata:" + automata;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Auto)) {
            return false;
        } else {
            Auto a = (Auto) obj;
            return this.rendszám.equals(a.getRendszám());
        }
    }

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(o.getTeljesítmény(), this.teljesítmény);
    }

//    public boolean SzabalyosE(Auto a) {
//        int igaz = 0;
//        for (int i = 0; i < 3; i++) {
//            char c = a.getRendszám().charAt(i);
//            if (isUpperCase(c)) {
//                for (int j = 3; j < 6; j++) {
//                    char sz = a.getRendszám().charAt(i);
//                    if (isDigit(sz)) {
//                        igaz = 1;
//                    }
//                }
//            }
//        }
//        if (igaz == 1) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
    
    public boolean SzabalyosE() {
        int igaz = 0;
        for (int i = 0; i < 3; i++) {
            char c = this.rendszám.charAt(i);
            
            if (Character.isUpperCase(c)) {
                for (int j = 3; j < 6; j++) {
                    char sz = this.rendszám.charAt(i);
                    if (Character.isDigit(sz)) {
                        igaz = 1;
                    }
                }
            }
        }
        if (igaz == 1) {
            return true;
        } else {
            return false;
        }

    }
}
