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

import lk.ac.vau.Model.Course;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("/course")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class CourseController {
private Repo<String,Course> courses = new Repo<String,Course>();
	public Collection<Course>getAll(){
		return courses.getAll();
	}
	@GetMapping("/{id}")
	 public Course get(@PathVariable("id") String id) {
		return courses.get(id);
	 }
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON)
	public void add(@PathVariable("id")String id, Course course){
		courses.add(course);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")String id) {
		courses.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id")String id,Course course) {
		courses.update(id, course);
	}
}
