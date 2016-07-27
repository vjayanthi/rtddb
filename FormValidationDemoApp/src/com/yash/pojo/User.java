package com.yash.pojo;

import javax.validation.constraints.Size;

public class User {
	@Size(min=2,max=20,message="please enter name between {min} and {max}")
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
	