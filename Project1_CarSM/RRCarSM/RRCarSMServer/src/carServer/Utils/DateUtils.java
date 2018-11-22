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
	 * @throws ParseException 
	 */
	public static long getSubDays(Date begin, Date end) throws ParseException {
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
		String date1=formatter.format(begin);
		String date2=formatter.format(end);
		Date d1=formatter.parse("2018-11-11");
		Date d2=formatter.parse(date2);
		long daysBetween=(d2.getTime()-d1.getTime()+1000000)/(60*60*24*1000);
		System.out.println( date1+"与"+date2+"相隔 "+daysBetween+" 天");
		return daysBetween;
	}
	/**
	 * 测试
	 */
	public static void main(String[] args) {
		DateUtils dateUtils = new DateUtils();
	}

}
