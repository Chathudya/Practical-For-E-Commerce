package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Lecturer;
import lk.ac.vau.Repo.LecturerRepo;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {
	@Autowired
	LecturerRepo context;
	
	@GetMapping
	public List<Lecturer>getAll(){
		return context.findAll();
	}
	@GetMapping("/{id}")
	public Lecturer get(@PathVariable("id") String id) {
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Lecturer lecturer) {
		context.save(lecturer);
	}
	@PutMapping
	public void update(@RequestBody Lecturer lecturer) {
		context.save(lecturer);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}

}
