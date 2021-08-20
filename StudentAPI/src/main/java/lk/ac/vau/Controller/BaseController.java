package lk.ac.vau.Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


public class BaseController<M> {
	
	Map<String,M> data = new HashMap<String,M>();
	
	@GetMapping
	public Collection<M>getAll(){
		return data.values();
	}
	@GetMapping("/{id}")
	 public M get(@PathVariable("id") String id) {
		return data.get(id);
	 }
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON)
	public void add(@PathVariable("id")String id, M student){
		data.put(id, student);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")String id) {
		data.remove(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id")String id,M student) {
		data.put(id,student);
	}
	

}
