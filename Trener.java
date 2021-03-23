package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Trener {

	private String imie, nazwisko, adres;
	private List<Zwierze> zwierzeta = new ArrayList<>();
	private List<Sprzet> sprzety = new ArrayList<>();
	private static List<Trener> ekstensja = new ArrayList<>();

	public Trener(String imie, String nazwisko, String adres) {

		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		ekstensja.add(this);
	}

	public String getImie() {
		return imie;
	}

	public List<Zwierze> getZwierzeta() {
		return zwierzeta;
	}

	public void setZwierzeta(List<Zwierze> zwierzeta) {
		this.zwierzeta = zwierzeta;
	}



	public static List<Trener> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Trener> ekstensja) {
		Trener.ekstensja = ekstensja;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public List<Sprzet> getSprzety() {
		return sprzety;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	

	public void przypiszZwierze(Zwierze zwierze) {
		if (zwierze.getTrener() != null) {
			throw new IllegalArgumentException("Zwierze ma przypsianego trenera");
		}
		zwierzeta.add(zwierze);
		zwierze.setTrener(this);
	}

	public void dodajSprzet(Sprzet sprzet) {
		sprzety.add(sprzet);
	}

	// -znajdz trenera ktory trenowa³ najwiecej zwierzat
	public static Trener najlepszyTrener(List<Trener> trenerzy) {
		if (trenerzy == null || trenerzy.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta");
		}
		Trener max = trenerzy.get(0);
		for (Trener element : trenerzy) {
			if (element.zwierzeta.size() > max.zwierzeta.size()) {
				max = element;
			}
		}

		return max;
	}

	public boolean czyMaSpaniela() {
		for (Zwierze z : zwierzeta) {
			if (z.getGatunek().equals("Spaniel")) {
				return true;

			}
		}
		return false;

	}

	// -znajdz trenerow ktorzy trenowali psy z gatunku spaniel
	public List<Trener> trenerSpaniela(List<Trener> trenerzy) {
		if (trenerzy == null || trenerzy.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta");
		}
		List<Trener> trenerzySpaniela = new ArrayList<>();
		for (Trener t : trenerzy) {
			if (czyMaSpaniela()) {
				trenerzySpaniela.add(t);
			}
		}
		return trenerzySpaniela;
	}
	// -znajdz trenera ktory uzywa³ jakiegos sprzetu najwieksza liczbe razy

	public Trener najczesciejUzywanySprzet(Sprzet sprzet, List<Trener> trenerzy) {
		if (trenerzy == null || trenerzy.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta");
		}
		Trener max = trenerzy.get(0);
		int licznik = 0;
		int tymczasowyMaks = 0;

		for (Trener t : trenerzy) {
			for (Sprzet s : sprzety) {
				if (s.equals(sprzet)) {
					licznik++;
				}
			}
			if (licznik > tymczasowyMaks) {
				max = t;
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return "Trener: imie= " + imie + ", nazwisko=" + nazwisko;
	}
	
}
