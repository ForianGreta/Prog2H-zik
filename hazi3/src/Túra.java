/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Túra {
    private String turistaNeve;
    private String útvonalleíró;

    public Túra(String turistaNeve, String útvonalleíró) {
        this.turistaNeve = turistaNeve;
        this.útvonalleíró = útvonalleíró;
    }

    public String getTuristaNeve() {
        return turistaNeve;
    }

    public String getÚtvonalleíró() {
        return útvonalleíró;
    }

    @Override
    public String toString() {
        return turistaNeve;
    }
    
}
