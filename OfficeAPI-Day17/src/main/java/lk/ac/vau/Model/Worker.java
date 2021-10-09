package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Worker {
	@Id
	private String workerId;
	private String name;
	private String workType;
	//one to many
	@OneToMany(mappedBy = "worker")
	private List <Assignment> buildings;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public Worker(String workerId, String name, String workType, List<Assignment> building) {
		super();
		this.workerId = workerId;
		this.name = name;
		this.workType = workType;
		this.buildings = building;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public List<Assignment> getBuilding() {
		return buildings;
	}

	public void setBuilding(List<Assignment> building) {
		this.buildings = building;
	}
	

	
}
