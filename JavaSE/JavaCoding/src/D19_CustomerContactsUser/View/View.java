package D19_CustomerContactsUser.View;

import java.util.Scanner;

import javax.rmi.CORBA.Util;

import com.hvua.domain.DAY15_implements.view.showDvdView;

import D19_CustomerContactsUser.Util.UtilTools;

public abstract class View {

	/**
	 * 下一个页面
	 */
	protected View nextView;
	/**
	 * 页面名称
	 */
	protected String viewName;
	/**
	 * 提供Scanner
	 */
	protected Scanner scan;

	/**
	 * 无参构造，每创造一个View都生成一个scan
	 */
	private View() {
		scan = new Scanner(System.in);
	}

	/**
	 * 有参构造，子类继承，赋值自己的页面名称
	 */
	public View(String viewName) {
		// 把无参构造里面的scan拿过来，目的是为了封装并唯一化每个View类的scan
		this();
		this.viewName = viewName;
	}
	/**
	 * 抽象类，也是每个页面展示的内容，showView
	 */
	protected abstract View showView();
	/**
	 * 使用模板模式，利用showCurrView返回showView()，
	 * 并且输出页面名字（有格式的，也就是创造工具类的方法）
	 */
	public View showCurrView() {
		UtilTools.showHeadLine(viewName){
			return showView();
		}
	}

}
