package com.sprboot.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Movie {
	@Id
	private int mid;
	@Column(nullable=false)
	private String mname;
	@Column(nullable=false)
	private String mgenre;
	@Column(nullable=false)
	private int mrating;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMgenre() {
		return mgenre;
	}
	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}
	public int getMrating() {
		return mrating;
	}
	public void setMrating(int mrating) {
		this.mrating = mrating;
	}
	public Movie(int mid, String mname, String mgenre, int mrating) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mgenre = mgenre;
		this.mrating = mrating;
	}
	public Movie() {
		
	}
}
