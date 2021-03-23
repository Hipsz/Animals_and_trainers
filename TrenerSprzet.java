package zwierzeta;

import java.time.LocalDate;

public class TrenerSprzet {
	private LocalDate dataWypozyczenia;
	private Trener trener;
	private Sprzet sprzet;
	public TrenerSprzet(LocalDate dataWypozyczenia, Trener trener, Sprzet sprzet) {
		
		this.dataWypozyczenia = dataWypozyczenia;
		this.trener = trener;
		this.sprzet = sprzet;
	}
	public LocalDate getDataWypozyczenia() {
		return dataWypozyczenia;
	}
	public void setDataWypozyczenia(LocalDate dataWypozyczenia) {
		this.dataWypozyczenia = dataWypozyczenia;
	}
	public Trener getTrener() {
		return trener;
	}
	public void setTrener(Trener trener) {
		this.trener = trener;
	}
	public Sprzet getSprzet() {
		return sprzet;
	}
	public void setSprzet(Sprzet sprzet) {
		this.sprzet = sprzet;
	}

	
}
