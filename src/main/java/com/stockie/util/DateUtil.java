package com.stockie.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static String MYSQL_DATEFORMAT = "yyyy-MM-dd HH:mm:ss";
	
	private static String ORC_DATEFORMAT = "dd/MM/yyyy HH:mm:ss";

	private static String UI_DATEFORMAT = "dd-MMM-yyyy HH:mm:ss";

	public static String getCurrentDate() {
		Date dt = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat(ORC_DATEFORMAT);

		String currentTime = sdf.format(dt);

		return currentTime;
	}

	public static String getFormattedDate(String date) throws java.text.ParseException {
		if (date != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(ORC_DATEFORMAT);

			SimpleDateFormat formatter = new SimpleDateFormat(UI_DATEFORMAT);
			Date dateStr = sdf.parse(date);
			return formatter.format(dateStr);
		}
		return date;		
	}
	
    public static Timestamp getCurrentTimeStamp()
    {
	 java.util.Date date= new java.util.Date();
	 return new Timestamp(date.getTime());
    }
    
    public static Timestamp convertToTimestamp(Date date) {
    	return (date != null)? new Timestamp(date.getTime()):null;
    }
}
