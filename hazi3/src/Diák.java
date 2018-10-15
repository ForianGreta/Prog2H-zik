/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Diák {
    private String sajátNeve;
    private String előzőNeve;

    public Diák(String sajátNeve, String előzőNeve) {
        this.sajátNeve = sajátNeve;
        this.előzőNeve = előzőNeve;
    }

    public String getSajátNeve() {
        return sajátNeve;
    }

    public String getElőzőNeve() {
        return előzőNeve;
    }

    @Override
    public String toString() {
        return "Di\u00e1k{" + "saj\u00e1tNeve=" + sajátNeve  + '}';
    }
}
