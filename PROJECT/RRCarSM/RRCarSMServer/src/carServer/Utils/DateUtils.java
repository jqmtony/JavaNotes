package carServer.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date相关工具
 * 
 * @author 李文娟
 *
 */
public class DateUtils {
	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getCurDate() {
		// 设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		return df.format(new Date());
	}

	/**
	 * 相隔日期
	 * 
	 * @throws ParseException
	 */
	public static long getSubDays(Date d1, Date d2) throws ParseException {
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		String date1 = formatter.format(d1);
//		String date2 = formatter.format(d2);
//		Date d1 = formatter.parse(date1);
//		Date d2= formatter.parse(date2);
		long daysBetween2 = (d2.getTime() - d1.getTime() + 1000000) / (60 * 60 * 24 * 1000);
		if(daysBetween2<=0) {
			return 1;
		}
		return daysBetween2;
	}
	/**
	 * 格式化时间
	 * @param args
	 * @throws ParseException 
	 */
	public static Date dateFormat(Date date) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = formatter.format(date);
		Date date2 = formatter.parse(date1);
		return date2;
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = formatter.format(new Date());
		Date date2 = formatter.parse(date1);
		System.out.println(date1);
		System.out.println(date2);
	}
}
