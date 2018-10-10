/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Scanner;

/**
 *
 * @author Gréta
 */
public class Test7 {

    private static Orarend orarend[];
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        orarend=new Orarend[n];
        for(int i=0;i<n;i++){
            String sor=sc.nextLine();
            Orarend ora=new Orarend(sor);
            
            
            
        }
    }
   
}
