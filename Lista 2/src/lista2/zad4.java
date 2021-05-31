package lista2;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj d1");
		int d1 = sc.nextInt();
		System.out.println("Podaj m1");
		int m1 = sc.nextInt();
		System.out.println("Podaj r1");
		int r1 = sc.nextInt();
		
		System.out.println("Podaj d2");
		int d2 = sc.nextInt();
		System.out.println("Podaj m2");
		int m2 = sc.nextInt();
		System.out.println("Podaj r2");
		int r2 = sc.nextInt();
		
		sc.close();
		
		int przed[]= {0,31,59,90,120,151,212,243,304,334};
		int po[]= {365,334,306,275,245,214,184,153,122,92,61,31};
		
		if (r1==r2)
		{
			int do1 = przed[m1-1]+d1;
			int do2 = przed[m1-1]+d2;
			if((r1%4==0&r1%100!=0) || r1%400 == 0)
			{
				if(m1>2)
				{
					do1++;
				}
				if(m2>2)
				{
					do2++;
				}
				System.out.println(do2-do1);
			}
		}
		else
		{
			int pelnelata = r2-r1-1;
			int dnipomiedzy = pelnelata*365;
			for(int i = r1+1; i<r2; i++)
			{
				if(isPrzestepny(i))
				{
					dnipomiedzy++;
				}
			}
			int dnidokonca = po[m1-1] - d1;
			if (isPrzestepny(r1) & m1 < 3)
			{
				dnidokonca++;
			}
			int dzienodpocz = przed[m2-1] + d2;
			if (isPrzestepny(r2) & (m2 > 2))
			{
				dzienodpocz++;
			}
			System.out.println("Iloœæ dni: " + (dnipomiedzy + dnidokonca + dzienodpocz));
			
		}
		
	}
	
	private static boolean isPrzestepny (int rok)
	{
		return ((rok%4==0&rok%100!=0) || rok%400 == 0);
	}

}
