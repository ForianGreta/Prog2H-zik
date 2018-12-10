
public class Kektura_Tura {

	private String kezdo;
	private String veg;
	private int tav;
	
	public Kektura_Tura(String egesz, int tav) {
		String[] s = egesz.split("-");
		this.kezdo = s[0];
		this.veg = s[1];
		
		this.tav = tav;
	}
	
	public String getKezdo() {
		return kezdo;
	}
	public void setKezdo(String kezdo) {
		this.kezdo = kezdo;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
	public int getTav() {
		return tav;
	}
	public void setTav(int tav) {
		this.tav = tav;
	}
}
