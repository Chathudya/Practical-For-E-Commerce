package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Instructor;
@Repository
public interface InstructorRepo  extends JpaRepository<Instructor, String>{
	
}
