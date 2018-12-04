/**
 * 
 */
package com.hwua.demo02;

/**
 * @author Administrator
 *
 */
public class WorkThread implements Runnable {

	private Account account;

	/**
	 * 
	 */
	public WorkThread(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// -- С�����ڷŵ��ǹ�����Դ.
		while (true) {
			synchronized (account) {
				if (account.getBalance() <= 0 ) {
					System.out.println("����");
					break;
				}					
				System.out.print(Thread.currentThread().getName() + "����ȡ��");
				System.out.print("��ǰ���:\t" + account.getBalance());
				System.out.print("\t ȡ��50");
				account.setBalance(account.getBalance() - 50);
				System.out.println("ʣ�����:\t" + account.getBalance());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
