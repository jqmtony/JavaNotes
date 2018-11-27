package carServer.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date��ع���
 * 
 * @author ���ľ�
 *
 */
public class DateUtils {
	/**
	 * ��ȡ��ǰʱ��
	 * 
	 * @return
	 */
	public static String getCurDate() {
		// �������ڸ�ʽ
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()Ϊ��ȡ��ǰϵͳʱ��
		return df.format(new Date());
	}

	/**
	 * �������
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
	 * ��ʽ��ʱ��
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
