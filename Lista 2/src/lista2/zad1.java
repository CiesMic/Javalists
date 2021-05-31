package lista2;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int day, hours, minutes, input; 
		
		System.out.println("Podaj czas ( w min) ");
		input=sc.nextInt();
		
		day = input / (8 * 60);
		
		hours = (input / 60) - (day * 8);
		
		minutes = input - ((day * 8)*60) - (hours * 60);
		sc.close();
		
		System.out.println("Dni: " + day + ", godziny: " + hours + ", minuty: " + minutes);
	}

}
