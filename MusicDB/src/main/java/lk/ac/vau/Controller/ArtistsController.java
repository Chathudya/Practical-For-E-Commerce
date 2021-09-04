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

import lk.ac.vau.Model.Artists;
import lk.ac.vau.Repo.ArtistsRepo;

@RestController
@RequestMapping("/artists")
@Produces(MediaType.APPLICATION_XML)
public class ArtistsController {
	@Autowired
	ArtistsRepo context;

	@GetMapping
	public List<Artists> getAll(){
		return context.findAll();
	}

	@GetMapping("/{artistid}")
	public Artists get(@PathVariable("artistid")String artistid) {
		return context.findById(artistid).get();
	}
	
	@PostMapping
	public void add(@RequestBody Artists artists) {
		context.save(artists);
	}
	
	@PutMapping
	public void update(@RequestBody Artists artists) {
		context.save(artists);
	}
	
	@DeleteMapping("/{artistid}")
	public void delete(@PathVariable("artistid") String artistid) {
		context.deleteById(artistid);
	}
}
