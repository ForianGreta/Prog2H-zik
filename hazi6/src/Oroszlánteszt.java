
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class Oroszlánteszt {

    public static void oroszlanSzamol(List<Állomás> l) {

        List <Integer> tmp=l.get(0).oroszanÜvöltésPoz(); //ez első állomás oroszlán üvöltései
        for(Állomás i:l)
            tmp.retainAll(i.oroszanÜvöltésPoz());  //retainAll csak azokat tratja meg a tmp-be, amik benne vannak a paraméterként kapott listában is, azaz ebben: i.oroszanÜvöltésPoz()
        
        System.out.println(tmp.size());      //végül csak a közös elemek(emelyek minden listában benne voltak) maradnak a tmp-be
        
               
    }

    public static void main(String[] args) {

        List<Állomás> l = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader br = new BufferedReader(fr);

            String sor;
            while ((sor = br.readLine()) != null) {
                if (sor.equals("END")) {
                    oroszlanSzamol(l);
                    
                    l.clear();
                } else {

                    String[] komponensek = sor.split(":");
                    Állomás  á= new Állomás(komponensek[0], komponensek[1]);
                    l.add(á);

                }

            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
