
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class PostaIranyitoszam  implements Comparable<PostaIranyitoszam>{
    private int IRszam;
    private List<Posta> lista;

    public PostaIranyitoszam(int IRszam) {
        this.IRszam = IRszam;
        this.lista = new ArrayList<>();
    }

    public int getIRszam() {
        return IRszam;
    }

    public List<Posta> getLista() {
        return lista;
    }
    public int osszertek(){
        int ossz=0;
        for(int i=0;i<lista.size();i++){
            ossz=ossz+lista.get(i).getErtek();
        }
        return ossz;
    }

   /* @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(IRszam).append(":").append(osszertek());
        
        return sb.toString();
    }
   */

    @Override
    public String toString() {
        return "PostaIranyitoszam{" + "IRszam=" + IRszam + ", lista=" + lista + '}';
    }
    
    
        @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj== null || !(obj instanceof Posta)){
           return false;
       }
       else{
           PostaIranyitoszam p=(PostaIranyitoszam)obj;
           return this.IRszam==p.getIRszam();
       }
    }

    @Override
    public int compareTo(PostaIranyitoszam o) {
        if(this.osszertek()==o.osszertek()){
            return Integer.compare(IRszam, o.getIRszam());
        }
        else{
            return Integer.compare(this.osszertek(), o.osszertek());
        }
    }
    
    
    
    
}
