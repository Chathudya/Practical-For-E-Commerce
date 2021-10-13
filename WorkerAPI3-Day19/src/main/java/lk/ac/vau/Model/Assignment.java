package lk.ac.vau.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Assignment implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "worker_id",referencedColumnName = "WorkerID")
	private Worker worker;
	@Id
	@ManyToOne
	@JoinColumn(name = "building_id",referencedColumnName = "BuildingID")
	private Building building;
	private Date Startdate; 
	private int Num_days;
	public Assignment() {
		// TODO Auto-generated constructor stub
	}
	public Assignment(Worker worker, Building building, Date startdate, int num_days) {
		super();
		this.worker = worker;
		this.building = building;
		Startdate = startdate;
		Num_days = num_days;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public Date getStartdate() {
		return Startdate;
	}
	public void setStartdate(Date startdate) {
		Startdate = startdate;
	}
	public int getNum_days() {
		return Num_days;
	}
	public void setNum_days(int num_days) {
		Num_days = num_days;
	}
	
}
