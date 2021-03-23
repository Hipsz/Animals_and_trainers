package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Pterodaktyl extends Zwierze {

	private double rozpietoscSkrzydel;

	public Pterodaktyl(String nazwa, String gatunek, double rozpietoscSkrzydel) {
		super(nazwa, gatunek);
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
	}

	public double getRozpietoscSkrzydel() {
		return rozpietoscSkrzydel;
	}

	public void setRozpietoscSkrzydel(double rozpietoscSkrzydel) {
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
	}

	// -znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
	public List<Pterodaktyl> pterodaktyleBezTrenera(List<Pterodaktyl> pterodaktyle) {
		if (pterodaktyle == null || pterodaktyle.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta");
		}
		List<Pterodaktyl> bezTrenera = new ArrayList<>();
		for (Pterodaktyl p : pterodaktyle) {
			if (p.getTrener() == null) {
				bezTrenera.add(p);
			}
		}
		return bezTrenera;
	}

}
