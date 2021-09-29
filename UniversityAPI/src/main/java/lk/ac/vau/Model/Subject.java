package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Subject {
	@Id
	private String subjectId;
	private String subjectName;
	
	@ManyToMany
	@JoinTable(name="subject_course",
	joinColumns={@JoinColumn(name="subject_id",referencedColumnName = "subjectId")},
	inverseJoinColumns = {@JoinColumn(name="course_id",referencedColumnName = "CourseId")})
	private List<Course>courses=new ArrayList<Course>();
	
	
	@ManyToOne
    @JoinColumn(name="LecturerId", referencedColumnName = "lecturerId")
    private Lecturer lecturer;
	public Subject() {
	}
	public Subject(String subjectId, String subjectName, List<Course> courses, Lecturer lecturer) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.courses = courses;
		this.lecturer = lecturer;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	
	
	
}