package lk.ac.vau.Controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Instructor;
import lk.ac.vau.Repo.InstructorRepo;

@RestController
@RequestMapping("/instructor")
//@Produces(MediaType.)
public class InstructorController {
	@Autowired
	private InstructorRepo repo;
	
	@GetMapping
	public List<Instructor>getAll(){
		return repo.findAll();
	}
	/*@PostMapping
	public void add (@RequestBody Instructor instructor) {
		repo.save(instructor);
	}*/
//	@PostMapping
//	public ResponseEntity<String>add(@Valid @RequestBody Instructor instructor){
//		repo.save(instructor);
//		return ResponseEntity.ok("Inserted to database");
//		
//	}
	
	@PostMapping
	public ResponseEntity<String> add(@Valid @RequestBody Instructor instructor){
		repo.save(instructor);
		return new ResponseEntity<String>("Inserted to database",HttpStatus.CREATED);

	}
	
	

}


















