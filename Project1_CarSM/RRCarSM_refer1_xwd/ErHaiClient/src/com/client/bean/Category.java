package com.client.bean;

import java.io.Serializable;

public class Category implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5694271727753352519L;
	private String id;
    private String name;

    public Category() {
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  id + '\t' + name;
    }
}
