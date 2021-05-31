package lista2;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int a, b;
		String znak;
		
		System.out.println("Podaj liczby");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Podaj znak");
		znak = sc.next();
		
		sc.close();
		
		classforzad2 cs = new classforzad2(a, b, znak);
		
		System.out.println("Wynik: " + cs.getresult());
		
	}
}
