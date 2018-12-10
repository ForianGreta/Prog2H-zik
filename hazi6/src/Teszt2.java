
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
 * @author Dóri
 */
public class Teszt2 {
    public static void main(String[] args) {
        //parancssori paraméter beállítása run->set project configuration->customize->Arguments:sample.txt
        
        List<Könyvem> li=new ArrayList<>();
        
        try{
            FileReader fr=new FileReader(new File(args[0]));//("sample.txt")
            BufferedReader br= new BufferedReader(fr);//ebbe tárolom amit beolvasok a fájlból, hatékonyabbá teszi a programot
            String sor;
            while((sor=br.readLine())!=null){//ez jelenti hogy a fájl végéig olvas
                String [] tmp=sor.split(";");
                Könyvem k=new Könyvem(tmp[tmp.length-2],Integer.parseInt(tmp[tmp.length-1]));
                for(int i=0;i<tmp.length-2;i++){
                    k.getSzerzők().add(tmp[i]);
                }
                li.add(k);
            }
            br.close();//lezárja a fájl olvasást
        }catch(IOException e){
            System.out.println("fájl hiba");
        }
        Collections.sort(li);
//        for(int i=li.size()-2;i>=0;i--){
//            if(li.get(i).equals(li.get(i+1))){
//                li.remove(i+1);
//            }//ez nem volt jó
//        }
        
        /*for(Könyvem i:li)
            System.out.println(i);*///kiiratás
        
        try{
            FileWriter fw=new FileWriter(new File("ki.txt"));
            BufferedWriter bw=new BufferedWriter(fw);
            
            List<Könyvem> l2=new ArrayList<>();
            for(int i=0;i<li.size()-1;i++){
                l2.add(li.get(i));
                for(int j=i+1;j<li.size();j++){
                    if(li.get(i).equals(li.get(j))){
                        li.remove(j);
                    }
                }
                l2.add(li.get(li.size()-1));
            }
            
            for(Könyvem i:l2){
            bw.write(i.toString());//ez a rész a fájlba írás
            bw.newLine();//új sorba írja
            }
            bw.close();//le kell zárni a buffert különben nem írja ki fájlba csak ha megtelik a buffer
        }catch(IOException e){
            
        }
    }
}
