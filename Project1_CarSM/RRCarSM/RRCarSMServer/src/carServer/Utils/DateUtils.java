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
	 * @throws ParseException 
	 */
	public static long getSubDays(Date begin, Date end) throws ParseException {
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
		String date1=formatter.format(begin);
		String date2=formatter.format(end);
		Date d1=formatter.parse("2018-11-11");
		Date d2=formatter.parse(date2);
		long daysBetween=(d2.getTime()-d1.getTime()+1000000)/(60*60*24*1000);
		System.out.println( date1+"��"+date2+"��� "+daysBetween+" ��");
		return daysBetween;
	}
	/**
	 * ����
	 */
	public static void main(String[] args) {
		DateUtils dateUtils = new DateUtils();
	}

}
