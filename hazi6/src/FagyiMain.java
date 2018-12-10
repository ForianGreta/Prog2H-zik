
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

/*
eper;120
csokolade;100
malna;120
citrom;110
 */
public class FagyiMain {

    public static void metodus(List<Fagyi> lista1, List<String> lista2, List<Integer> lista3) {
        for (int i = 0; i < lista2.size(); i++) {
            for(int j=0;j<lista1.size();j++){
                if(!(lista1.get(j).equals(lista2.get(i)))){
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Fagyi> li = new ArrayList<>();

        try {
            FileReader fr = new FileReader(new File("fagyi.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] st = sor.split("[:;]");
                Fagyi f = new Fagyi(st[0]);
                for (int i = 1; i < st.length; i++) {
                    f.getFagylalt().add(st[i]);
                }
                li.add(f);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("file error");
        }
        System.out.println("file lista:");
        for (Fagyi a : li) {
            System.out.println(a);
        }

        List<String> li2 = new ArrayList<>();
        List<Integer> li3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] st = sor.split(";");
            li2.add(st[0]);
            li3.add(Integer.parseInt(st[1]));
            sor = sc.nextLine();
        }

    }
}
