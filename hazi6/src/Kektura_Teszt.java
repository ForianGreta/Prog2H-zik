import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kektura_Teszt {

	public static ArrayList<Kektura_Ember> emberLi = new ArrayList<Kektura_Ember>(); 
	
	public static boolean exist(String name) {
		for (Kektura_Ember p : emberLi) {
			if(p.getNev().contains(name)) {
				return true;
			}
		}
		return false;
	}
	
	public static void hozzaAd(String name, String tura, int tav) {
		for (Kektura_Ember p : emberLi) {
			if(p.getNev().contains(name)) {
				p.ujTura(new Kektura_Tura(tura, tav));
			};
		}
	}
	
	public static void read(File f) throws FileNotFoundException {
		Scanner sc =  new Scanner(f);
		while(sc.hasNextLine()) {			
			
			String line = sc.nextLine();
			String[] l = line.split(":");
			
			String nev = l[0];
			String tura = l[1];
			int tav = Integer.parseInt(l[2]);
			
			if(emberLi.size() == 0) {
				Kektura_Ember p = new Kektura_Ember(nev);
				p.ujTura(new Kektura_Tura(tura, tav));
				emberLi.add(p);
				
			} else if(exist(nev)) {
				hozzaAd(nev, tura, tav);
			}
			else {
				Kektura_Ember p = new Kektura_Ember(nev);
				p.ujTura(new Kektura_Tura(tura, tav));
				emberLi.add(p);
			}
		}
	}
	
	public static void main(String[] args) {

		File f = new File("sample.txt");
		
		try {
			read(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (Kektura_Ember p : emberLi) {
				//p.printTurak();
			System.out.println(p.getNev() + " " + p.leghosszabbTura());
		}

	}

}
