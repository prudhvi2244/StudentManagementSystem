package com.sms.in.model;

public class Student {

	public Student() {

	}

	public Student(Integer sid, String sname, String scity, Double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.smarks = smarks;
	}

	private Integer sid;
	private String sname;
	private String scity;
	private Double smarks;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Double getSmarks() {
		return smarks;
	}

	public void setSmarks(Double smarks) {
		this.smarks = smarks;
	}

}
