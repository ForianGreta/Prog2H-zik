
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
public class PostaTeszt {

    public static void main(String[] args) {
        List<PostaIranyitoszam> li = new ArrayList<>();
        li.add(new PostaIranyitoszam(33234));

        try {
            FileReader fr = new FileReader(new File("posta.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;

            while ((sor = br.readLine()) != null) {
                int tmp = 0;
                String[] st = sor.split(":");
                Posta p = new Posta(st[0], Integer.parseInt(st[1]), st[2], st[3], Integer.parseInt(st[4]), Integer.parseInt(st[5]));

                for (int i = 0; i < li.size(); i++) {
                    if(Integer.parseInt(st[1])== li.get(i).getIRszam()) {
                        li.get(i).getLista().add(p);
                        tmp = 1;
                    }
                    if (tmp == 0) {

                        PostaIranyitoszam a = new PostaIranyitoszam(Integer.parseInt(st[1]));
                        a.getLista().add(p);
                        li.add(a);
                    }

                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("fájl hiba");
        }
        Collections.sort(li);
        for (PostaIranyitoszam a : li) {
            System.out.println(a);
        }

    }}


