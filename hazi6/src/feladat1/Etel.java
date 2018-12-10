
public class Etel extends Termek{
	
	private int szav_ido;

	public Etel(String name, float price, String unit, int eatable, int quantity) {

		this.nev = name;
		this.egyseg = unit;
		this.ar = price;
		this.mennyiseg = quantity;
		this.szav_ido = eatable;
	}
	
	public Etel() {
		this.nev = null;
		this.egyseg = null;
		this.ar = 0;
		this.mennyiseg = 0;
		this.szav_ido = 0;
	}

	public int getSzav_ido() {
		return szav_ido;
	}

	public void setSzav_ido(int szav_ido) {
		this.szav_ido = szav_ido;
	}
}
