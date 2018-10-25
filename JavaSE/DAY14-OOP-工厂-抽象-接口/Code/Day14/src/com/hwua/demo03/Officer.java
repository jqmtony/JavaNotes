package com.hwua.demo03;

public class Officer extends Solider {

	public void order(Solider solider) {
		solider.attack();
	}
	
	/**
	 * ... 代表可变参数 等同于 数组
	 * solider... 等价于 Solider[]
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
