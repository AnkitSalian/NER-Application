package com.ankit.nerapplication.model;

public enum Type {
	
	PERSON("Person"),
	CITY("City"),
	STATE_OR_PROVINCE("State_Or_Province"),
	COUNTRY("Country"),
	EMAIL("Email"),
	TITLE("Title");
	
	private String type;
	
	 Type(String type) {
		// TODO Auto-generated constructor stub
		 this.type=type;
	}
	 
	public String getName() {
		return type;
	}

}
