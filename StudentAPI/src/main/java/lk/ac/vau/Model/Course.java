package lk.ac.vau.Model;

public class Course extends PrimaryId<String> {
	public String courseid;
	public String coursename;
	private int duration;
	public Course() {
		
	}
	public Course(String courseid, String coursename, int duration) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.duration = duration;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
