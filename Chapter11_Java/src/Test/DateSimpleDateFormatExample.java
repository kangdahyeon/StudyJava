package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimpleDateFormatExample {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sim = 
			new SimpleDateFormat ("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sim.format(date));
	}
}
