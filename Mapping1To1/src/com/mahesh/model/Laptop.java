package com.mahesh.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lid")
	private int lid;

	@Column(name = "lapname")
	private String lapname;

	@Column(name = "price")
	private float lapprice;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String lapname, float lapprice) {
		super();
		this.lapname = lapname;
		this.lapprice = lapprice;
	}

	public String getLapname() {
		return lapname;
	}

	public void setLapname(String lapname) {
		this.lapname = lapname;
	}

	public float getLapprice() {
		return lapprice;
	}

	public void setLapprice(float lapprice) {
		this.lapprice = lapprice;
	}

	@Override
	public String toString() {
		return "Laptop [lapname=" + lapname + ", lapprice=" + lapprice + "]";
	}

}
