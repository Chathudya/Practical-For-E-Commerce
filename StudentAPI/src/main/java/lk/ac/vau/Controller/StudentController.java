package lk.ac.vau.Controller;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.PrimaryId;
import lk.ac.vau.Model.Student;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("/student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class StudentController{

	private Repo<String, Student> students = new Repo<String,Student>();
	@GetMapping
	public Collection<Student>getAll(){
		return students.getAll();
	}
	@GetMapping("/{id}")
	 public Student get(@PathVariable("id") String id) {
		return students .get(id);
	 }
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON)
	public void add(@PathVariable("id")String id, Student student){
		students.add(student);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")String id) {
		students.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id")String id,Student student) {
		students.update(id, student);
	}
}


















