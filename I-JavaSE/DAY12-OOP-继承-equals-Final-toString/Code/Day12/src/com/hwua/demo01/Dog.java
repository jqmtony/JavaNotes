package com.hwua.demo01;

public class Dog extends Animal{
	
	
	
	// "abc".equals(answer)
		@Override
		public boolean equals(Object obj) {
			//-- �жϲ����Ƿ�Ϊnull
			if (obj == null) {
				return false;
			}
			//-- �ж������Ƿ�һ��
			if (obj.getClass() != this.getClass()) {
				return false;
			}
			//-- �Ѳ���ת���ɵ�ǰ����
			//-- Object�����ǵķ�Χ�Ƚϴ�.
			//-- ��Dog��Object��Ƚ�С.�����ǰѴ�ĸ�ֵ��С��Ҫǿת.
			//-- ǿת�ķ�ʽ�ο�ԭ����������.
			Dog d = (Dog)obj;
			//-- �����������ж��Ƿ����.
			if (this.getName().equals(d.getName()) && 
					this.getAge() == d.getAge() &&
					this.getColor().equals(d.getColor())) {
				return true;
			}else {
				return false;
			}		
		}
	
}
