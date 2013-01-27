package ejemplo_date;

import java.util.*;

public class ejemplo_fecha {

	public static void main(String[] args) {

		Date d = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "-");
		System.out.print(c.get(Calendar.MONTH)+1 + "-");
		System.out.print(c.get(Calendar.YEAR));
		System.out.println();
		System.out.print(c.get(Calendar.HOUR)+12 + ":");
		System.out.print(c.get(Calendar.MINUTE) + ":");
		System.out.print(c.get(Calendar.SECOND) + ":");
		System.out.print(c.get(Calendar.MILLISECOND));
		System.out.println();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.UNDECIMBER));
		System.out.println(c.get(Calendar.AM_PM));
	}
}