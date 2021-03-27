package List3;

import java.util.Scanner;

public class Zad05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj dane:");

		String dane = sc.nextLine();

		sc.close();

		if (dane.length() <= 3) {
			daneUzytkownika(Integer.valueOf(dane));
		} else if (dane.contains(".")) {
			String[] dataUrodzenia = dane.split("\\.");
			if (dataUrodzenia.length == 3)
			{
			daneUzytkownika(dataUrodzenia);
			}
			else System.out.println("B³êdny format dat");
		} else if (dane.length() == 11) {
			daneUzytkownika(dane);
		} else {
			String[] ImieNazwisko = dane.split(" ");
			if (ImieNazwisko.length == 2) {
				daneUzytkownika(ImieNazwisko[0], ImieNazwisko[1]);
			} else if (ImieNazwisko.length == 3) {
				daneUzytkownika(ImieNazwisko[0], ImieNazwisko[1], ImieNazwisko[2]);
			}
		}

	}

	private static void daneUzytkownika(int rok) {
		System.out.println("Rok urodzenia: " + (2021 - rok));
	}

	private static void daneUzytkownika(String imie, String nazwisko) {
		System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko);
	}

	private static void daneUzytkownika(String pimie, String dimie, String nazwisko) {
		System.out.println("Pierwsze imie: " + pimie + ", Drugie imie: " + dimie + ", Nazwisko: " + nazwisko);
	}

	private static void daneUzytkownika(String[] dane) {
		
		String miesiac[] = {"stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "wrzesnia", "pazdziernika", "listopada", "grudnia"};
		System.out.println("Urodzi³eœ/aœ siê w " + dane[0] + " " + miesiac[Integer.valueOf(dane[1]) - 1] + " " + dane[2] + "roku");
	}

	private static void daneUzytkownika(String pesel) {
		System.out.println("Twoj PESEL: " + pesel);
		
		System.out.println("Data: " + pesel.substring(4,6));
		
		if (Integer.valueOf(pesel.substring(0, 2)) <= 21)
		{
			System.out.println("Miesi¹c: " + (Integer.valueOf(pesel.substring(2, 4)) - 20));
		}
		else System.out.println("Miesi¹c: " + pesel.substring(2, 4));
		
		if (Integer.valueOf(pesel.substring(0, 2)) <= 21)
		{
			System.out.println("Rok urodzenia: 20" + pesel.substring(0, 2));
		}
		else System.out.println("Rok urodzenia: 19" + pesel.substring(0, 2));
		
		if (pesel.charAt(9) % 2 == 0)
		{
			System.out.println("P³eæ: Kobieta");
		}
		else System.out.println("P³eæ: Mêzczyzna");
		
		System.out.println("Cyfra kontrolna: " + pesel.charAt(10));
	}

}