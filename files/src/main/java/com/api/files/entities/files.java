package com.api.files.entities;

public class files {

	private int sno;
	private String description;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public files(int sno, String description) {
		super();
		this.sno = sno;
		this.description = description;
	}

	public files() {
		super();
		// TODO Auto-generated constructor stub
	}

}
