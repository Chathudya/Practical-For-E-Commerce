package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;

@Entity
public class Instructor {
	public Instructor(@NotEmpty @Size(min = 4, max = 8, message = "Check your ID!") String id,
			@NotNull(message = "Please provide a name") String name,
			@Min(value = 20, message = "Age should be more than 20") @Max(value = 60, message = "Age should be less than 60") int age,
			@javax.validation.constraints.Email(message = "Check your email address") String email, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Email = email;
		this.experience = experience;
	}


	@Id
	@NotEmpty
	@Size(min = 4, max = 8, message = "Check your ID!")
	private String id;
	@NotNull(message = "Please provide a name")
	private String name;
	@Min(value = 20, message = "Age should be more than 20" )
	@Max(value = 60, message = "Age should be less than 60" )
	private int age;
	@Email(message = "Check your email address")
	private String Email;
	private int experience;
	
	
	public Instructor() {
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	

}
