package lk.ac.vau.Model;

public class Lecturer {
	public String lecturerid;
	public String name;
	public String courseid;
	public Lecturer(String lecturerid, String name, String courseid) {
		super();
		this.lecturerid = lecturerid;
		this.name = name;
		this.courseid = courseid;
	}
	public String getLecturerid() {
		return lecturerid;
	}
	public void setLecturerid(String lecturerid) {
		this.lecturerid = lecturerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	
	
}
