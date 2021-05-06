package List5;

import java.util.Scanner;

public class Zad01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadz n: ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		int len = length(n, n);
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				for(int k = length(j,i); k<len; k++)
				{
					System.out.print(" ");
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
	
	private static Integer length(int l, int j)
	{
		return (int)(Math.log10(l*j));
	}
}
