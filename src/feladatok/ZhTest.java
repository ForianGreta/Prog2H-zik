/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gréta
 */

/*
Edit;18
Alex;9
Csilla;13
Kelemen;20
Edit;3
Kelemen;1
Csilla;7
*/
public class ZhTest {

    public static void main(String[] args) {

        List<Zh> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String[] st=sor.split(";");
            String nev=st[0];
            int pont=Integer.parseInt(st[1]);
            boolean isIn=false;
            
            if(li.size()==0){
                li.add(new Zh(nev, pont));
                isIn=true;
            }
            else{
                for(int i=0;i<li.size();i++){
                    if(li.get(i).getNev().equals(nev)){
                        li.get(i).setPont(li.get(i).getPont()+pont);
                        isIn=true;
                    }
                }
            }
            if(!isIn){
                li.add(new Zh(nev, pont));
            }
            sor=sc.nextLine();
        }
        Collections.sort(li);
        for(Zh i: li){
            System.out.println(i);
        }
    }
}
