package List4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Zad03 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Podaj obie daty (wg formatu dd.MM.yyyy");
		
		String data1 = sc.next();
		
		String data2 = sc.next();
		
		Date d1, d2;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		d1 = sdf.parse(data1);
		d2 = sdf.parse(data2);
		
		System.out.print(Math.abs(d1.getTime() - d2.getTime()) /(1000*60*60*24));
		
	}

}
