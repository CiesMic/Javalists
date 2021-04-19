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
		
		try
		{
		
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Tokyo");
		TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Moscow");
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		
		Date date = format.parse(prz + " 09:03:00");
		
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
		
		System.out.println("First City: " + d1);
		System.out.println("Second City: " + d2);
		System.out.println("Differences: " + (Math.abs(d1) + Math.abs(d2)));
		}
		catch(ParseException e)
		{
			System.out.println("Wrong format");
		}
	}
}
