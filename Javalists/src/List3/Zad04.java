package List3;

import java.util.Scanner;

public class Zad04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj dane:");
		
		String dane = sc.next();
		
		if(dane.length() == 11)
		{
			daneUzytkownika(dane);
		}
		else 
		{
			daneUzytkownika(Integer.valueOf(dane));
		}
		
		sc.close();

	}
	
	private static void daneUzytkownika(String dane) 
	{
		System.out.println("Twoj PESEL: " + dane);
	}

	private static void daneUzytkownika(int dane)
	{
		System.out.println("Urodzi³eœ siê w: " + (2021 - dane) + "r");
	}

}
