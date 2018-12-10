
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
public class FagyiMegrendeles {

    private List<String> fajta;
    private List<Integer> ar;

    public FagyiMegrendeles() {
        fajta= new ArrayList<>();
        ar=new ArrayList<>();
    }

    public List<String> getFajta() {
        return fajta;
    }

    public List<Integer> getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "FagyiMegrendeles{" + "fajta=" + fajta + ", ar=" + ar + '}';
    }
    

    

}
