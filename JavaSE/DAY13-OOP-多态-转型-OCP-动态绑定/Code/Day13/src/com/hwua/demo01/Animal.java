package com.hwua.demo01;

/**
 * 
 * @author Administrator
 *
 */
public class Animal {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		//-- Object���޲ι���. Objectֻ��һ��Ĭ�ϵ��޲ι���.
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
