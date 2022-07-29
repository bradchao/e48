package tw.brad.utils;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	public MyClock() {
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		setText(String.format("%04d-%02d-%02d", year, month, day));
	}

}
