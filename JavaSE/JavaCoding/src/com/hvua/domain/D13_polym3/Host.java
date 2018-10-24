package com.hvua.domain.D13_polym3;

public class Host {
	private String host;
	
	public Host(String name) {
		this.host = name;
	}

	public String getHost() {
		return host;
	}
	
	public void control(Equipment equipment) {
		System.out.println(getHost()+"想要对"+equipment.getName()+"进行开关：");
	}
}
