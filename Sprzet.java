package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Sprzet {
	private String nazwa;
	private StanSprzetu stanSprzetu;
	private int iloscNapraw;

	public Sprzet(String nazwa, StanSprzetu stanSprzetu) {

		this.nazwa = nazwa;
		this.stanSprzetu = stanSprzetu;
	
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public StanSprzetu getStanSprzetu() {
		return stanSprzetu;
	}

	public int getIloscNapraw() {
		return iloscNapraw;
	}

	public void setIloscNapraw(int iloscNapraw) {
		this.iloscNapraw = iloscNapraw;
	}

	public void setStanSprzetu(StanSprzetu stanSprzetu) {
		this.stanSprzetu = stanSprzetu;
	}

	public void naprawaSprzetu() {

		if (stanSprzetu != StanSprzetu.TRAGICZNY) {
			throw new IllegalArgumentException("Sprzetu nie mo¿na naprawiæ");
		}

		stanSprzetu = StanSprzetu.UZYWANY;
		iloscNapraw++;
	}
	// -znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy

	public List<Sprzet> naprawiane2Razy() {
		List<Sprzet> sprzety = new ArrayList<>();
		List<Sprzet> naprawiane = new ArrayList<>();
		for (Sprzet s : sprzety) {
			if (s.getIloscNapraw() >= 2) {
				naprawiane.add(s);
			}
		}
		return naprawiane;
	}

	@Override
	public String toString() {
		return  nazwa + " Stan Sprzetu= " + stanSprzetu + ", Ilosc Napraw= " + iloscNapraw;
	}
	
}
