import java.util.ArrayList;

public class Kektura_Ember {

	private String nev;
	private  ArrayList<Kektura_Tura> li  = new ArrayList<Kektura_Tura>();
	
	public Kektura_Ember(String nev) {
		this.nev = nev;
	}
	
	public void ujTura(Kektura_Tura t) {
		li.add(t);
	}
	
	public void turaKiir() {
		System.out.println(nev + " túrái:");
		for (Kektura_Tura tura : li) {
			System.out.println(tura.getKezdo() + "-" + tura.getVeg() + " [" + tura.getTav()+"]");
		}
		System.out.println();
	}

	public String getNev() {
		return nev;
	}
	
	private void utvonalRagasztas() {
		
		ArrayList<Kektura_Tura> li2 = new ArrayList<Kektura_Tura>();
		boolean change = false;
		
		for (Kektura_Tura tura1 : li) {	
			for (Kektura_Tura tura2 : li) {
				
				if(tura1.getVeg().contains(tura2.getKezdo())) {
					String a = tura1.getKezdo() + "-" + tura2.getVeg();
					Kektura_Tura t = new Kektura_Tura(a, tura1.getTav() + tura2.getTav());
					li2.add(t);
					change = true;
				}
			}	
		}
		
		for (Kektura_Tura tura : li2) {
			li.add(tura);
		}		
	}
	
	public int leghosszabbTura() {	
		int oldSize = li.size();
		for(int i = 0; i < oldSize; i++) {
			utvonalRagasztas();}
		
		int max = 0;
		for (Kektura_Tura tura : li) {
			if(tura.getTav() > max) max = tura.getTav();
		}
		return max;
	}
}
