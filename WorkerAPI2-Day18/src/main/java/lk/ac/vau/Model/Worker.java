package lk.ac.vau.Model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Worker {
	@Id
	private long WorkerID;
	private String WorkerName;
	private double HourlyRate;
	
	enum SkillType{
		Electric,
		Olumbing,
		Roofing,
		Framing
	}
	@Enumerated(EnumType.STRING)
	private SkillType skillType;
	@ManyToOne
	@JoinColumn(name = "supervisor_id",referencedColumnName = "WorkerID")
	private Worker Supervisor;
	@OneToMany(mappedBy = "worker")
	private List<Assignment>WorkgAssignments;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	

	public Worker(long workerID, String workerName, double hourlyRate, SkillType skillType, Worker supervisor,
			List<Worker> workers, List<Assignment> buildingAssignments) {
		super();
		WorkerID = workerID;
		WorkerName = workerName;
		HourlyRate = hourlyRate;
		this.skillType = skillType;
		Supervisor = supervisor;
		//this.workers = workers;
		WorkgAssignments = buildingAssignments;
	}


	public long getWorkerID() {
		return WorkerID;
	}

	public void setWorkerID(long workerID) {
		WorkerID = workerID;
	}

	public String getWorkerName() {
		return WorkerName;
	}

	public void setWorkerName(String workerName) {
		WorkerName = workerName;
	}

	public double getHourlyRate() {
		return HourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		HourlyRate = hourlyRate;
	}

	public SkillType getSkillType() {
		return skillType;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}

	public Worker getSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(Worker supervisor) {
		Supervisor = supervisor;
	}

//	public List<Worker> getWorkers() {
//		return workers;
//	}
//
//	public void setWorkers(List<Worker> workers) {
//		this.workers = workers;
//	}

	public List<Assignment> getBuildingAssignments() {
		return WorkgAssignments;
	}

	public void setBuildingAssignments(List<Assignment> buildingAssignments) {
		WorkgAssignments = buildingAssignments;
	}

		
	
}
