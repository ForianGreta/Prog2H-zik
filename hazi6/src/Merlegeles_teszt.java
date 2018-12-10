
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
public class Merlegeles_teszt {

    public static void main(String[] args) {
        List<Merlegeles> li = new ArrayList<>();

        try {
            FileReader fr = new FileReader(new File("merlegeles.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            while ((sor = br.readLine()) != null) {
                int tmp=0;
                String[] st = sor.split(":");
                Merlegeles m = new Merlegeles(st[0], st[1], Integer.parseInt(st[2]));
                for (int i = 0; i < li.size(); i++) {
                    if (st[0].equals(li.get(i).getCegnev()) && st[1].equals(li.get(i).getTelephely())) {
                        li.get(i).getBevetel().add(Integer.parseInt(st[3]));
                        tmp=1;
                    }
                    
                }
                if(tmp==0){
                
                    m.getBevetel().add(Integer.parseInt(st[3]));
                
                li.add(m);}
            }
                br.close();
            }catch(IOException e){
            System.out.println("fájl hiba");
        }
            Collections.sort(li);

            for (Merlegeles a : li) {
                System.out.println(a);
            }

        }
    }
