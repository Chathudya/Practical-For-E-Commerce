package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Student {
	@Id
	private long StudentId;
	private String Name;
	private String Institute;
	@ManyToMany
	@JoinTable(name="student_course",
	joinColumns={@JoinColumn(name="student_id",referencedColumnName = "StudentId")},
	inverseJoinColumns = {@JoinColumn(name="course_id",referencedColumnName = "CourseId")})
	private List<Course>courses=new ArrayList<Course>();
	
	@ManyToOne
    @JoinColumn(name="courseId", referencedColumnName = "CourseId")
    private Course course;
	
	@OneToOne
    @JoinColumn(name = "researchId", referencedColumnName = "researchId")
    private FinalResearchProject research;
	public Student() {
		
	}
	
	public Student(long studentId, String name, String institute, List<Course> courses, Course course,
			FinalResearchProject research) {
		super();
		StudentId = studentId;
		Name = name;
		Institute = institute;
		this.courses = courses;
		this.course = course;
		this.research = research;
	}

	public long getStudentId() {
		return StudentId;
	}
	public void setStudentId(long studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getInstitute() {
		return Institute;
	}
	public void setInstitute(String institute) {
		Institute = institute;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public FinalResearchProject getResearch() {
		return research;
	}
	public void setResearch(FinalResearchProject research) {
		this.research = research;
	}

	
	
}
