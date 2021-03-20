package List3;

import java.util.Scanner;

public class Zad02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj s³owo");
		String longslowo = sc.next();

		System.out.println("Podaj s³owo (nie)bêd¹ce podzbiorem pierwszego");
		String shor = sc.next();

		// int k=0;

		// for(int i=0; i<longslowo.length() - shor.length();i++)
		// {
		// if (longslowo.charAt(i) == shor.charAt(0))
		// {
		// for (int j=1;j<shor.length();j++)
		// {
		// if(longslowo.charAt(i+j) == shor.charAt(j))
		// {
		// k++;
		// if (k == shor.length()-1)
		// {
		// System.out.println("Jest pozbiorem");
		// return;
		// }
		// }
		// else
		// {
		// k = 0;
		// break;
		// }
		// }
		// }
		// }

		for (int i = 0; i < longslowo.length(); i++) {
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
