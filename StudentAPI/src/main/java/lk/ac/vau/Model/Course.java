package lk.ac.vau.Model;

public class Course {
	public String courseid;
	public String coursename;
	public Course(String courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
}
