package com.mahesh.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rollNo")
	private int rollNo;

	@Column
	private String sname;

	@OneToOne
	private Laptop laptop;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student(int rollNo, String sname, Laptop laptop) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", laptop=" + laptop + "]";
	}

}
