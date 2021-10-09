package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Building {
	@Id
	private String buildingId;
	private String address;
	private int nooffloors;
	private double cost;
	//one to many
	@OneToMany(mappedBy = "building")
	private List <Assignment> workers;
	public Building() {
		// TODO Auto-generated constructor stub
	}
	public Building(String buildingId, String address, int nooffloors, double cost, List<Assignment> workers) {
		super();
		this.buildingId = buildingId;
		this.address = address;
		this.nooffloors = nooffloors;
		this.cost = cost;
		this.workers = workers;
	}
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNooffloors() {
		return nooffloors;
	}
	public void setNooffloors(int nooffloors) {
		this.nooffloors = nooffloors;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<Assignment> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Assignment> workers) {
		this.workers = workers;
	}
	
	
	
}
