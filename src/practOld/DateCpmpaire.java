package practOld;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author anuj.pal
 *
 */
public class DateCpmpaire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a date : ");
		date_Compare(sc.next());
		
		sc.close();
	}
	
	
	protected static String date_Compare(final String dateInStr) {
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = new Date(System.currentTimeMillis());
		Date providedDate = stringToDate(dateInStr);
		String r = "";
		System.out.println("System Date: " + currentDate);
		if (providedDate.after(currentDate)) {
			System.out.println("providedDate " + providedDate + " is future date" + currentDate);
			r = "F";
		}

		if (providedDate.before(currentDate)) {
			System.out.println("providedDate " + providedDate + " is Past date " + currentDate);
			r = "P";
		}

		return r;
	}

	protected static Date stringToDate(String dateInStr) {

		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dateType = null;
		try {
			dateType = df.parse(dateInStr);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateType;
	}
	
}
