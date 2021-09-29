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

import lk.ac.vau.Model.FinalResearchProject;
import lk.ac.vau.Repo.FinalResearchProjectRepo;

@RestController
@RequestMapping("/research")
public class FinalResearchProjectController {
	@Autowired
	FinalResearchProjectRepo context;
	

	@GetMapping
	public List<FinalResearchProject>getAll(){
		return context.findAll();
	}
	@GetMapping("/{id}")
	public FinalResearchProject get(@PathVariable("id") String id) {
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody FinalResearchProject research) {
		context.save(research);
	}
	@PutMapping
	public void update(@RequestBody FinalResearchProject research) {
		context.save(research);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
	
}
