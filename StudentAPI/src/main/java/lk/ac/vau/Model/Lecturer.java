package lk.ac.vau.Model;

public class Lecturer extends PrimaryId<Long> {
	public long id;
	public String name;
	public String department;
	public Lecturer() {
		
	}
	public Lecturer(long lecturerid, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseid() {
		return department;
	}
	public void setCourseid(String courseid) {
		this.department = courseid;
	}
	
	
}
