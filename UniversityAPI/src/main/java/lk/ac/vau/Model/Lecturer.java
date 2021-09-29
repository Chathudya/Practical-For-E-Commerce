package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Lecturer {
	@Id
	private String lecturerId;
	private String lecturerName;
	
	
	
	public Lecturer() {
		
	}



	public Lecturer(String lectureId, String lectureName) {
		super();
		this.lecturerId = lectureId;
		this.lecturerName = lectureName;
	}



	public String getLectureId() {
		return lecturerId;
	}



	public void setLectureId(String lectureId) {
		this.lecturerId = lectureId;
	}



	public String getLectureName() {
		return lecturerName;
	}



	public void setLectureName(String lectureName) {
		this.lecturerName = lectureName;
	}

	
}