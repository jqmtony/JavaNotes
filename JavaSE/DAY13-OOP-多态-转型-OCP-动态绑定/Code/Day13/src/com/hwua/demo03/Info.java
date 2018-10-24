package com.hwua.demo03;

public class Info {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Info(String content) {
		super();
		this.content = content;
	}

	@Override
	public String toString() {
		return "Info [content=" + content + "]";
	}
	
}
