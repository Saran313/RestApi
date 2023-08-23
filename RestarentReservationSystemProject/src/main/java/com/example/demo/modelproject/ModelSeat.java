package com.example.demo.modelproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detsils")
public class ModelSeat {
	@Id
	private int regid;
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getRegneme() {
		return regneme;
	}
	public void setRegneme(String regneme) {
		this.regneme = regneme;
	}
	public String getRegmobile() {
		return regmobile;
	}
	public void setRegmobile(String regmobile) {
		this.regmobile = regmobile;
	}
	public ModelSeat(int regid, String regneme, String regmobile) {
		super();
		this.regid = regid;
		this.regneme = regneme;
		this.regmobile = regmobile;
	}
	public ModelSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String regneme;
	private String regmobile;
	
}
