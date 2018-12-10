package feladat1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static ArrayList<Termek> termekek = new ArrayList<Termek>();

	public static boolean exist(String nev, float ar, String egyseg, int mennyiseg) {
		
		for (Termek term : termekek) {
			if(term.getNev().equals(nev) && 
			   term.getAr() == ar &&
			   term.getEgyseg().contains(egyseg)) {
				return true;
			}
		}	
		return false;
	}
	
	public static boolean mennyisegNovel(String nev, float ar, String egyseg, int mennyiseg) {
		for (Termek product : termekek) {
			if(product.getNev().equals(nev) && 
			   product.getAr() == ar &&
			   product.getEgyseg().contains(egyseg)) {
				product.mennyisegNovel(mennyiseg);
				return true;
			}
		}
		return false;
	}
	
	public static void clean() {
		ArrayList<Termek> toRemove = new ArrayList<Termek>();
		for (Termek product : termekek) {
		    if (product.getMennyiseg()== 0) {
		        toRemove.add(product);
		    }
		}
		termekek.removeAll(toRemove);
	}
	
	public static void elad(String name, int mennyiseg){
		
		boolean isZero = false;
		for (Termek product : termekek) {
			if(product.getNev().equals(name)) {
				product.elad(mennyiseg);
				if(product.getMennyiseg()== 0) isZero = true;
			}
		}
		
		if(isZero)
			clean();
	}
	
	public static void read(File f) throws FileNotFoundException {
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner scLine = new Scanner(line);
			scLine.useDelimiter(";");
			
			String tipus = scLine.next();
			String nev = scLine.next();	
			float ar = Float.valueOf(scLine.next());
			String egyseg = scLine.next();
			
			if(tipus.contains("E")) {
				int szavido = Integer.parseInt(scLine.next());
				int mennyiseg = Integer.parseInt(scLine.next());
				
				if(!exist(nev, ar, egyseg, mennyiseg)) {
					termekek.add(new Etel(nev, ar, egyseg, szavido, mennyiseg));
				}else {
					mennyisegNovel(nev, ar, egyseg, mennyiseg);					
				}
			}
			else {
				int mennyiseg = Integer.parseInt(scLine.next());
				if(!exist(nev, ar, egyseg, mennyiseg)) {
					termekek.add(new Fogycikk(nev, ar, egyseg, mennyiseg));
				}else {
					mennyisegNovel(nev, ar, egyseg, mennyiseg);
				}
			}
		}
	}
	
	public static void kiir() {
		for (Termek p : termekek) {
			if(p.getClass().equals(new Etel().getClass())) {
				Etel actualFood = (Etel) p;
				System.out.println(p.getNev() + "\t" + p.getMennyiseg() + " db\tmég " + actualFood.getEatable() + " napig eheto");
				}
			else {
				System.out.println(p.getNev()+ "\t" + p.getMennyiseg() + " db\t");
			}
		}
	}

	public static void main(String[] args) {

		File f = new File(args[0]);

		try {read(f);}
		catch (FileNotFoundException e) { e.printStackTrace(); }

		kiir();
		
		elad("kígyóuborka", 8);
		System.out.println();
		kiir();
		
		//sell("kígyóuborka", 13);
		
		elad("kígyóuborka", 12);
		System.out.println();

		kiir();
	}
}
