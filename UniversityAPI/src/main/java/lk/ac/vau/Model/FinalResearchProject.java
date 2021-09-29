package lk.ac.vau.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class FinalResearchProject {
	@Id
	private String researchId;
	private String title;
	private String area;
	private Long StudentId;
	
	
	@OneToOne(mappedBy = "research")
    private Student student;
	
	@ManyToOne
    @JoinColumn(name="lecturerId", referencedColumnName = "lecturerId")
    private Lecturer lecturer;
	
	public FinalResearchProject() {
		// TODO Auto-generated constructor stub
	}

	public FinalResearchProject(String researchId, String title, String area, Long studentId, Student student,
			Lecturer lecturer) {
		super();
		this.researchId = researchId;
		this.title = title;
		this.area = area;
		StudentId = studentId;
		this.student = student;
		this.lecturer = lecturer;
	}

	public String getResearchId() {
		return researchId;
	}

	public void setResearchId(String researchId) {
		this.researchId = researchId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getStudentId() {
		return StudentId;
	}

	public void setStudentId(Long studentId) {
		StudentId = studentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}


}
