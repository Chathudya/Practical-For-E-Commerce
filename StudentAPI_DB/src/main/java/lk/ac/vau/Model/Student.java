package lk.ac.vau.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private String studentid;
	@Column(name="student_name")
	private String name;
	private int age;
	private double gpa;
	private String dgree;
	
	public Student() {
		
	}

	public Student(String studentid, String name, int age, double gpa, String dgree) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.dgree = dgree;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getName() {           
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getDgree() {
		return dgree;
	}

	public void setDgree(String dgree) {
		this.dgree = dgree;
	}
	
}
