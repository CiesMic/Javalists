package List4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Zad04 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj datê i godzinê (wg formatu dd.MM.yyyy");
		
		String prz = sc.nextLine();
		
		sc.close();
		
		TimeZone timeZone = TimeZone.getTimeZone("Europe/Warsaw");
		TimeZone timeZone2 = TimeZone.getTimeZone("America/Puerto_Rico");
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		
		Date date = format.parse(prz + " 09:03:00");
		System.out.println(timeZone.getRawOffset()/(1000*60*60));
		System.out.println(timeZone2.getRawOffset()/(1000*60*60));
		System.out.println(timeZone.getDSTSavings()/(1000*60*60));
		System.out.println(timeZone2.getDSTSavings()/(1000*60*60));
		System.out.println(timeZone.inDaylightTime(date));
		System.out.println(timeZone2.inDaylightTime(date));
		
		long d1 = (timeZone.getRawOffset()/(1000*60*60));
		long d2 = (timeZone2.getRawOffset()/(1000*60*60));
		
		if(timeZone.inDaylightTime(date))
		{
			d1+=(timeZone.getDSTSavings()/(1000*60*60));
		}
		if(timeZone2.inDaylightTime(date))
		{
			d2+=(timeZone2.getDSTSavings()/(1000*60*60));
		}
		
		System.out.println("Warsaw: " + d1);
		System.out.println("Toronto: " + d2);
		System.out.println("Ró¿nica: " + (Math.abs(d1) + Math.abs(d2)));
	}
}
