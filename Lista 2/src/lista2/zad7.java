package lista2;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj liczbê ca³kowit¹ (Pamiêtaj ¿e 2^32 - 1");
		
		int a = sc.nextInt();
		
		sc.close();
		
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a^4);
		System.out.println(Integer.toBinaryString(a^4));
		System.out.println(Integer.toBinaryString(a^2147483647));
	}

}
