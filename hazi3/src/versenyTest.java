
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class versenyTest {
    
       private static verseny[] kp;

    public static int résztávÖsszeg(verseny rt) {
        int sum = 0;
        for (int i = 0; i < rt.getRésztáv(); i++) {
            sum = sum + rt.getRésztáv();
        }
        return sum;
    }

    public static void rendez(verseny[] t) {
        for(int i=0;i<t.length-1;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i].getIdeje().compareTo(t[j].getIdeje())==1){                    
                   verseny tmp=t[i];
                   t[i]=t[j];
                   t[j]=tmp;
                   
                }
                else if(t[i].getIdeje().compareTo(t[j].getIdeje())==0){
                    verseny tmp=t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                }
                
            }
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        kp = new verseny[n];
        for (int i = 0; i < n; i++) {
            String sor = sc.nextLine();
            
            
        }
    }

}
