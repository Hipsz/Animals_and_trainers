package zwierzeta;

public class Pies extends Zwierze{

	private double dlugoscSiersci;
	private String ulubioneZabawki;
	public Pies(String nazwa, String gatunek, double dlugoscSiersci, String ulubioneZabawki) {
		super(nazwa, gatunek);
		this.dlugoscSiersci = dlugoscSiersci;
		this.ulubioneZabawki = ulubioneZabawki;
	}
	public double getDlugoscSiersci() {
		return dlugoscSiersci;
	}
	public void setDlugoscSiersci(double dlugoscSiersci) {
		this.dlugoscSiersci = dlugoscSiersci;
	}
	public String getUlubioneZabawki() {
		return ulubioneZabawki;
	}
	public void setUlubioneZabawki(String ulubioneZabawki) {
		this.ulubioneZabawki = ulubioneZabawki;
	}
	
}
