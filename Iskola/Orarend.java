/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author Gréta
 */
public class Orarend {
    public String nap;
    public Ora[] t;
    public int count;
    
     
    
    public Orarend(String nap){
        this.nap=nap;
        this.count=0;
        this.t=new Ora[12];       
        
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getT() {
        return t;
    }

    public void setT(Ora[] t) {
        this.t = t;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Orarend:" + "nap=" + nap + ", t=" + t + ", count=" + count;
    }
    
  public boolean oratHozzaad(Ora or){
      if(this.count==12 || this.count>12 ){
          return false;
      }
      else{
          for(int i=0;i<=this.count;i++){
              if(t[i].equals(or)){
                  return false;
              }
          }
          this.t[this.count]=or;
          this.count++;
          return true;
      }     
  }
     
   
}

