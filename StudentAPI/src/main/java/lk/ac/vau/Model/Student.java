package lk.ac.vau.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student extends PrimaryId<String>{
	public String id;
	public String name;
	public int age;
	public String degree;
	public double gpa;
	
	public Student(String id, String name, int age, String degree, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.gpa = gpa;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
