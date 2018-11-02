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
		// -- 小括号内放的是共享资源.
		while (true) {
			synchronized (account) {
				if (account.getBalance() <= 0 ) {
					System.out.println("余额不足");
					break;
				}					
				System.out.print(Thread.currentThread().getName() + "正在取款");
				System.out.print("当前余额:\t" + account.getBalance());
				System.out.print("\t 取款50");
				account.setBalance(account.getBalance() - 50);
				System.out.println("剩余余额:\t" + account.getBalance());
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
