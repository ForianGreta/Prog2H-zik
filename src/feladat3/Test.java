package feladat3;

public class Test {

	public static void main(String[] args) {
		
		Tea t1 = new Tea("Mate", 500);
		Tea t2 = new Tea("Csipkebogyó", 300);
		
		System.out.println(t1.nagyobbMint(t2));
		
		System.out.println(t1.egyenlo(t2));
		
		System.out.println(t1.kisebbMint(t2));
	}
}

class Tea implements Rendezheto<Tea> {
	public String nev;
	public int ar;
	public Tea(String s,int j) {
		nev=s;
		ar=j;
	}
	
	@Override
	public boolean egyenlo(Tea o) {		
		return this.ar == o.getAr() && this.getNev().equals(o.getNev());
	}
	@Override
	public boolean nagyobbMint(Tea o) {
		
		return this.getAr() > o.getAr();
	}
	@Override
	public boolean kisebbMint(Tea o) {
	
		return this.getAr() < o.getAr();
	}
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getAr() {
		return ar;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}	

}
