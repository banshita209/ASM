package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student extends Parent_model {

	private long enroll_no;
	private String name;
	private int sem;
	private String branch;

	@Id
	@Column(name = "enroll_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getEnroll_no() {
		return enroll_no;
	}

	public void setEnroll_no(long enroll_no) {
		this.enroll_no = enroll_no;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sem")
	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	@Column(name = "branch")
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [enroll_no=" + enroll_no + ", name=" + name + ", sem=" + sem + ", branch=" + branch + "]";
	}

}
