package com.devinspirare.commons.generic;

public abstract class Entity<T extends Object> {

	private String status;
	private String message;

	T clazz;

	public Entity() {
		this.clazz = clazz;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
