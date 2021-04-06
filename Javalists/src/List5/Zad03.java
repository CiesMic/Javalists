package List5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Zad03 {

	public static void main(String[] args) throws ParseException {

		Date data;
		List<Date> listdate = new ArrayList<Date>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

		Scanner sc = new Scanner(System.in);

		boolean is_Duplicate;
		while (true) {
			try {
				is_Duplicate = false;
				System.out.println("Podaj date wg formatu dd.MM.yyyy");
				data = sdf.parse(sc.next());
				if (listdate.size() < 4 & listdate.size() > 0) {
					for (int i = 0; i < listdate.size(); i++) {
						if (((Date) listdate.get(i)).equals(data)) {
							is_Duplicate = true;
						}
					}
					if (!is_Duplicate) {
						listdate.add(data);
						Collections.sort(listdate);
						System.out.println(listdate);
					} else {
						System.out.println("Duplicated");
					}
				} else if (listdate.size() == 0) {
					listdate.add(data);
				} else if (listdate.size() > 3) {
					System.out.println("Is Full");
					break;
				}
			} catch (ParseException e) {
				System.out.println("Wrong format");
			}
		}
	}

}
