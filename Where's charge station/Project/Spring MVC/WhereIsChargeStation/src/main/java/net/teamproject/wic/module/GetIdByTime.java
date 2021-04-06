package net.teamproject.wic.module;

import java.util.Calendar;

public class GetIdByTime {
	public static String getIdByTime() {
		Calendar cal = Calendar.getInstance();
		String id = "";
		
		id += cal.get(Calendar.YEAR);
		id += cal.get(Calendar.MONTH);
		id += cal.get(Calendar.DATE);
		id += cal.get(Calendar.HOUR_OF_DAY);
		id += cal.get(Calendar.MINUTE);
		id += cal.get(Calendar.SECOND);
		id += cal.get(Calendar.MILLISECOND);

		return id;
	}
}