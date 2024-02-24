package com.Abhi.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rollno")
	private int rollNo;

	@Column(name = "name")
	private String name;
	@Column(name = "marks")
	private int marks;

//	@OneToOne
//	private Laptop laptop;
//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

//	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
//	private List<Laptop> laptop = new ArrayList<>();

//	@ManyToMany(mappedBy = "student", cascade = CascadeType.ALL)
//	private List<Laptop> laptop = new ArrayList<>();

//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}
