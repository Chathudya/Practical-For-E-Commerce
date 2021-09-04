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

import lk.ac.vau.Model.AlbumTracks;
import lk.ac.vau.Repo.AlbumTracksRepo;

@RestController
@RequestMapping("/albumtracks")
@Produces(MediaType.APPLICATION_XML)

public class AlbumTracksController {
	@Autowired
	AlbumTracksRepo context;
	
	@GetMapping
	public List<AlbumTracks> getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{trackid}")
	public AlbumTracks get(@PathVariable("trackid")String trackid) {
		return context.findById(trackid).get();
	}
	
	@PostMapping
	public void add(@RequestBody AlbumTracks albumtracks) {
		context.save(albumtracks);
	}
	
	@PutMapping
	public void update(@RequestBody AlbumTracks albumtracks) {
		context.save(albumtracks);
	}
	
	@DeleteMapping("/{trackid}")
	public void delete(@PathVariable("id") String trackid) {
		context.deleteById(trackid);
	}
}
