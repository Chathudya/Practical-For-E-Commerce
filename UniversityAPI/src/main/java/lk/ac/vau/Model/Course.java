package lk.ac.vau.Model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Course {
	@Id
	private String CourseId;
	private String Name;
	private int duration;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy ="courses" )
	private List<Student>students= new ArrayList<Student>();
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy ="courses" )
	private List<Subject>subjects= new ArrayList<Subject>();

	@OneToMany(mappedBy="course")
    private List<Student> student;
	
	
	public Course() {
		
	}


	public Course(String courseId, String name, int duration, List<Student> students, List<Subject> subjects,
			List<Student> student) {
		super();
		CourseId = courseId;
		Name = name;
		this.duration = duration;
		this.students = students;
		this.subjects = subjects;
		this.student = student;
	}


	public String getCourseId() {
		return CourseId;
	}


	public void setCourseId(String courseId) {
		CourseId = courseId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public List<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}
	

}
