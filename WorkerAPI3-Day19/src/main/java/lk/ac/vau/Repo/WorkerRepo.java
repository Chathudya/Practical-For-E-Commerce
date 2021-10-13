package lk.ac.vau.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lk.ac.vau.Model.Worker;

public interface WorkerRepo extends JpaRepository<Worker, Long> { 
	
//	@Query("select w from Worker w where w.skillType =?1")
//	List<Worker> findBySkillType(String skill);
//	
	@Query("select w from Worker w where w.WorkerName like %?1%")
	List<Worker> findByName(String name);
	
//	@Query("select w.hourly_rate from Worker w where w.id")
//	List<Worker> findById(String id);
//	
	@Query("Select w.Supervisor from Worker w where w.WorkerID=?1 ")
	List <Worker> findBySupId(long id);
	
}
