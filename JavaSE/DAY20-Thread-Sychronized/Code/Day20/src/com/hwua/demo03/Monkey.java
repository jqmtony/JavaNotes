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
					System.out.println("û��������!");
					break;
				}

				if (peach.getNum() == 1) {
					System.out.println(getName() + "ȡ��1������,ʣ��0��");
					peach.setNum(0);
				} else {
					System.out.print(getName());
					System.out.print("ȡ��" + (peach.getNum() / 2) + "������");
					peach.setNum(peach.getNum() - peach.getNum() / 2);
					System.out.println("ʣ����������:\t" + peach.getNum());
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
