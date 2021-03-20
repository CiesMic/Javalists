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
			daneUzytkownika(dataUrodzenia);
		} else if (dane.length() == 11) {
			daneUzytkownika(dane);
		} else {
			String[] ImieNazwisko = dane.split("\\ ");
			if (ImieNazwisko.length == 2) {
				daneUzytkownika(ImieNazwisko[0], ImieNazwisko[1]);
			} else if (ImieNazwisko.length == 3) {
				daneUzytkownika(ImieNazwisko[0], ImieNazwisko[1], ImieNazwisko[2]);
			}
		}

	}

	private static void daneUzytkownika(int rok) {
		System.out.println("Rok urodzenia: " + (2021 - rok) + " roku");
	}

	private static void daneUzytkownika(String imie, String nazwisko) {
		System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko);
	}

	private static void daneUzytkownika(String pimie, String dimie, String nazwisko) {
		System.out.println("Pierwsze imie: " + pimie + ", Drugie imie: " + dimie + ", Nazwisko: " + nazwisko);
	}

	private static void daneUzytkownika(String[] dane) {
		System.out.println("Urodzi³eœ/aœ siê w " + dane[0] + "." + dane[1] + "." + dane[2]);
	}

	private static void daneUzytkownika(String dane) {
		System.out.println("Twoj PESEL: " + dane);
	}

}