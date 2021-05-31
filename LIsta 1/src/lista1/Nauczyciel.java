package lista1;

import java.util.Scanner;

public class Nauczyciel {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Uczen u1;
		Uczen u2;
		Uczen u3 = new Uczen();
		System.out.println("Dane pierwszego ucznia");
		
		System.out.println("Podaj imie");
		String imie= sc.next();
		
		System.out.println("Podaj numer kursu");
		int numerkursu= sc.nextInt();
		
		System.out.println("Podaj rok");
		int rok= sc.nextInt();
		
		System.out.println("Podaj ocene");
		int ocena= sc.nextInt();
		
		System.out.println("Podaj ulubiony kolor");
		String kolor= sc.next();
		
		u1 = new Uczen(imie, ocena, kolor, rok);
		
		System.out.println("Dane drugiego ucznia");
		
		System.out.println("Podaj imie");
		imie= sc.next();
		
		System.out.println("Podaj numer kursu");
		numerkursu= sc.nextInt();
		
		System.out.println("Podaj rok");
		rok= sc.nextInt();
		
		System.out.println("Podaj ocene");
		ocena= sc.nextInt();
		
		System.out.println("Podaj ulubiony kolor");
		kolor= sc.next();
		u2 = new Uczen(imie, ocena, kolor, rok);
		
		System.out.println(u1.getImie() + " " + u1.getNumerKursu() + " " + u1.getRok() + " " + u1.getOcena() + " " + u1.getKolor());
		System.out.println(u2.getImie() + " " + u2.getNumerKursu() + " " + u2.getRok() + " " + u2.getOcena() + " " + u2.getKolor());
		System.out.println(u3.getImie() + " " + u3.getNumerKursu() + " " + u3.getRok() + " " + u3.getOcena() + " " + u3.getKolor());
		
		sc.close();
	}
}
