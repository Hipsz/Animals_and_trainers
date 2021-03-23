package zwierzeta;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		/*
		 *  W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów przechowujemy dodatkowe ich dlugosc siersci 
			oraz ulubione zabawki ,dla kotów stopien bycia wkurwiajacym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.
			
			Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.
			
			Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)), sprzet moze byc naprawiany.
			 Chcemy przechowywac informacje o tym jaki trener uzywal kiedy
			jkaiego sprzetu. Sprzet przez trenera moze byc uzywany wielokrotnie. 

		
			-znajdz trenera ktory trenowa³ najwiecej zwierzat
			-znajdz trenera ktory uzywa³ jakiegos sprzetu najwieksza liczbe razy
			-znajdz trenerow ktorzy trenowali psy z gatunku spaniel
			-znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy
			-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera

		 */
 
		Pies p1 = new Pies("Azor", "Spaniel", 10, "pilka");
		Pies p2 = new Pies("Figa", "Owczarek niemiecki", 20, "pilka");
		Pies p3 = new Pies("Azor", "Sznaucer", 5, "pilka");
		Trener t1 = new Trener("Andrzej", "Wolski", "Ogorodwa");
		Trener t2 = new Trener("Wojtek", "Kowalski", "Wolksa");
		Trener t3 = new Trener("Jan", "Dolny", "Dworcowa");
		Trener t4 = new Trener ("Anna", "Tokarzewska","Zakapustna");
		Sprzet s1 = new Sprzet("Pilka",StanSprzetu.NOWY);
		Sprzet s2 = new Sprzet("Sznur",StanSprzetu.UZYWANY);
		Sprzet s3 = new Sprzet("Lawka",StanSprzetu.UZYWANY);
		Sprzet s4 = new Sprzet("Drabina",StanSprzetu.TRAGICZNY);
		Kot k1 = new Kot("SZafir", "Siersciuch", 10);
		TrenerSprzet Ts1 = new TrenerSprzet(LocalDate.of(2021, 04, 11), t4, s1);
		t1.dodajSprzet(s1);
		t1.przypiszZwierze(p1);
		t1.przypiszZwierze(p2);
		t1.przypiszZwierze(p3);
		t4.przypiszZwierze(k1);
		
		//t2.przypiszZwierze(p1);
		//t3.przypiszZwierze(p3);
		System.out.println(Trener.najlepszyTrener(Trener.getEkstensja()));
		System.out.println(t4.getZwierzeta());
		System.out.println(s4);
		s4.naprawaSprzetu();
		System.out.println(s4);
		
		
	}

}
