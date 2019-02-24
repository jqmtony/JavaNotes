package com.hwua.demo03;

public class Officer extends Solider {

	public void order(Solider solider) {
		solider.attack();
	}
	
	/**
	 * ... ����ɱ���� ��ͬ�� ����
	 * solider... �ȼ��� Solider[]
	 *
	 * @param soliders
	 */
	public void order(Solider... soliders) {
		for (Solider solider : soliders) {
			solider.attack();
		}
	}
	
	
	@Override
	public void attack() {

	}

}
