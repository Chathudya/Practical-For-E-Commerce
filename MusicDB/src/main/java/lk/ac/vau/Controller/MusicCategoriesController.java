package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.MusicCategories;
import lk.ac.vau.Repo.MusicCategoriesRepo;

@RestController
@RequestMapping("/musiccategories")
@Produces(MediaType.APPLICATION_XML)
public class MusicCategoriesController {
	@Autowired
	MusicCategoriesRepo context;

	@GetMapping
	public List<MusicCategories> getAll(){
		return context.findAll();
	}

	@GetMapping("{categoryid}")
	public MusicCategories get(@PathVariable("categoryid")String categoryid) {
		return context.findById(categoryid).get();
	}
	
	@PostMapping
	public void add(@RequestBody MusicCategories category) {
		context.save(category);
	}
	
	@PutMapping
	public void update(@RequestBody MusicCategories category) {
		context.save(category);
	}
	
	@DeleteMapping("{categoryid}")
	public void delete(@PathVariable("categoryid") String categoryid) {
		context.deleteById(categoryid);
	}
}
