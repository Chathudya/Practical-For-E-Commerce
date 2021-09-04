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

import lk.ac.vau.Model.MusicAlbums;
import lk.ac.vau.Repo.MusicAlbumsRepo;

@RestController
@RequestMapping("/musicalbum")
@Produces(MediaType.APPLICATION_XML)
public class MusicAlbumsController {
	@Autowired
	MusicAlbumsRepo context;

	@GetMapping
	public List<MusicAlbums> getAll(){
		return context.findAll();
	}

	@GetMapping("{albumid}")
	public MusicAlbums get(@PathVariable("albumid")String albumid) {
		return context.findById(albumid).get();
	}
	
	@PostMapping
	public void add(@RequestBody MusicAlbums albumid) {
		context.save(albumid);
	}
	
	@PutMapping
	public void update(@RequestBody MusicAlbums albumid) {
		context.save(albumid);
	}
	
	@DeleteMapping("{albumid}")
	public void delete(@PathVariable("albumid") String albumid) {
		context.deleteById(albumid);
	}
}
