package zwierzeta;

public class Kot extends Zwierze{

	private int stopienWkurwienia;

	public Kot(String nazwa, String gatunek, int stopienWkurwienia) {
		super(nazwa, gatunek);
		this.stopienWkurwienia = stopienWkurwienia;
	}

	public int getStopienWkurwienia() {
		return stopienWkurwienia;
	}

	public void setStopienWkurwienia(int stopienWkurwienia) {
		this.stopienWkurwienia = stopienWkurwienia;
	}
	

	@Override
	public String toString() {
		return "Kot futrzak: " +getNazwa() + " + stopienWkurwienia: " + stopienWkurwienia;
	}
	
}
