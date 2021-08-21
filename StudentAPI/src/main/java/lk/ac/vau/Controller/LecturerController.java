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

import lk.ac.vau.Model.Lecturer;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("lecturer")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class LecturerController {
	private Repo<Long,Lecturer> courses = new Repo<Long,Lecturer>();
	@GetMapping
	public Collection<Lecturer>getAll(){
		return courses.getAll();
	}
	@GetMapping("/{id}")
	 public Lecturer get(@PathVariable("id") Long id) {
		return courses.get(id);
	 }
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON)
	public void add(@PathVariable("id")Long id, Lecturer lecturer){
		courses.add(lecturer);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")Long id) {
		courses.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id")Long id,Lecturer lecturer) {
		courses.update(id, lecturer);
	}
}
