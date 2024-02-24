package com.Abhi.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

	@Id
	@Column(name = "l_id")
	private int lId;

	@Column(name = "l_name")
	private String lName;

//	@ManyToOne
//	@JoinColumn(name = "student_id")
//	private Student student;
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}

	@ManyToMany
	@Column(name = "student_id")
	private List<Student> student = new ArrayList<>();

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + "]";
	}
}
