package D19_CustomerContactsUser.View;

import java.util.Scanner;

import javax.rmi.CORBA.Util;

import com.hvua.domain.DAY15_implements.view.showDvdView;

import D19_CustomerContactsUser.Util.UtilTools;

public abstract class View {

	/**
	 * ��һ��ҳ��
	 */
	protected View nextView;
	/**
	 * ҳ������
	 */
	protected String viewName;
	/**
	 * �ṩScanner
	 */
	protected Scanner scan;

	/**
	 * �޲ι��죬ÿ����һ��View������һ��scan
	 */
	private View() {
		scan = new Scanner(System.in);
	}

	/**
	 * �вι��죬����̳У���ֵ�Լ���ҳ������
	 */
	public View(String viewName) {
		// ���޲ι��������scan�ù�����Ŀ����Ϊ�˷�װ��Ψһ��ÿ��View���scan
		this();
		this.viewName = viewName;
	}
	/**
	 * �����࣬Ҳ��ÿ��ҳ��չʾ�����ݣ�showView
	 */
	protected abstract View showView();
	/**
	 * ʹ��ģ��ģʽ������showCurrView����showView()��
	 * �������ҳ�����֣��и�ʽ�ģ�Ҳ���Ǵ��칤����ķ�����
	 */
	public View showCurrView() {
		UtilTools.showHeadLine(viewName){
			return showView();
		}
	}

}
