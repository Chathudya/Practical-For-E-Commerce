package lk.ac.vau.Model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//worker-building
@Entity
public class Assignment implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	//many to one - join column
	@ManyToOne
	@JoinColumn(name="w_id",referencedColumnName = "workerId")
	private Worker worker;
	@ManyToOne
	@JoinColumn(name="b_id",referencedColumnName = "buildingId")
	private Building building;
	private int workingHours;
	private int payment;
	
	public Assignment() {
		// TODO Auto-generated constructor stub
	}

	public Assignment(long id, Worker worker, Building bulding, int workingHours, int payment) {
		super();
		this.id = id;
		this.worker = worker;
		this.building = bulding;
		this.workingHours = workingHours;
		this.payment = payment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Building getBulding() {
		return building;
	}

	public void setBulding(Building bulding) {
		this.building = bulding;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	
	
}
