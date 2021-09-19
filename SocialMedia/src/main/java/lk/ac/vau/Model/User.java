package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class User {
	@Id
	private String userId;
	private String emailId;
	private String firstName;
	private String lastName;
	
	private int age;
	@OneToMany(mappedBy = "owner")
	private List <Post> posts;
	@OneToMany(mappedBy = "commentedBy")
	private List <Comment> comments;
	
	public User() {
		
	}
	public User(String userId, String emailId, String firstName, String lastName, int age, List<Post> posts) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.posts = posts;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
}
