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

import lk.ac.vau.Model.Subject;
import lk.ac.vau.Repo.SubjectRepo;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectRepo context;
	

	@GetMapping
	public List<Subject>getAll(){
		return context.findAll();
	}
	@GetMapping("/{id}")
	public Subject get(@PathVariable("id") String id) {
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Subject subject) {
		context.save(subject);
	}
	@PutMapping
	public void update(@RequestBody Subject subject) {
		context.save(subject);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
	

}
