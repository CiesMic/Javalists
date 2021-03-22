package List3;

import java.util.Scanner;

public class Zad02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj s³owo");
		String longslowo = sc.next();

		System.out.println("Podaj s³owo (nie)bêd¹ce podzbiorem pierwszego");
		String shor = sc.next();
		
		sc.close();
		
		for (int i = 0; i < longslowo.length() - shor.length() + 1; i++) {
			if (longslowo.charAt(i) == shor.charAt(0)) {
				if (shor.equals(longslowo.substring(i, i + shor.length()))) {
					System.out.println("Jest pozbiorem");
					return;
				}
			}
		}
		System.out.println("Nie jest pozbiorem");
	}

}
