
public abstract class Termek {

	protected String nev;
	protected String egyseg;
	protected float ar;
	protected int mennyiseg;
	
	public int getMennyiseg() {
		return mennyiseg;
	}
	public void setMennyiseg(int mennyiseg) {
		this.mennyiseg = mennyiseg;
	}
	public void mennyisegNovel(int mennyiseg) {
		this.mennyiseg += mennyiseg;
	}
	
	public void elad(int mennyiseg) {
		if(this.mennyiseg >= mennyiseg) {
			this.mennyiseg -= mennyiseg;
			System.out.println("ELADTÁL " + mennyiseg + " db-ot. MARADT: " + this.mennyiseg);
		}
		else {
			System.out.println("NEM LEHET ENNYIT (" + mennyiseg + ") ELADNI EBBŐL: " + nev + " ! ELÉRHETŐ MENNYISÉG: " + this.mennyiseg);
		}
	}
	
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getEgyseg() {
		return egyseg;
	}
	public void setEgyseg(String egyseg) {
		this.egyseg = egyseg;
	}
	public float getAr() {
		return ar;
	}
	public void setAr(float ar) {
		this.ar = ar;
	}	
	
	
	
	
}
