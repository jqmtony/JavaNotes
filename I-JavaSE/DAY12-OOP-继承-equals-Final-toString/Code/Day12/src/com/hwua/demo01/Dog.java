package com.hwua.demo01;

public class Dog extends Animal{
	
	
	
	// "abc".equals(answer)
		@Override
		public boolean equals(Object obj) {
			//-- 判断参数是否为null
			if (obj == null) {
				return false;
			}
			//-- 判断类型是否一致
			if (obj.getClass() != this.getClass()) {
				return false;
			}
			//-- 把参数转换成当前类型
			//-- Object所涵盖的范围比较大.
			//-- 而Dog和Object相比较小.所以是把大的赋值给小的要强转.
			//-- 强转的方式参考原生数据类型.
			Dog d = (Dog)obj;
			//-- 利用特征来判断是否相等.
			if (this.getName().equals(d.getName()) && 
					this.getAge() == d.getAge() &&
					this.getColor().equals(d.getColor())) {
				return true;
			}else {
				return false;
			}		
		}
	
}
