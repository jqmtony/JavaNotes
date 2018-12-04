/**
 * 
 */
package com.hwua.demo03;

/**
 * @author Administrator
 *
 */
public class Monkey extends Thread {

	private Peach peach;

	public Monkey(Peach peach, String name) {
		super(name);
		this.peach = peach;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (peach) {
				if (peach.getNum() <= 0) {
					System.out.println("没有桃子了!");
					break;
				}

				if (peach.getNum() == 1) {
					System.out.println(getName() + "取走1个桃子,剩余0个");
					peach.setNum(0);
				} else {
					System.out.print(getName());
					System.out.print("取走" + (peach.getNum() / 2) + "个桃子");
					peach.setNum(peach.getNum() - peach.getNum() / 2);
					System.out.println("剩余桃子数量:\t" + peach.getNum());
				}

				try {
					sleep(333);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
