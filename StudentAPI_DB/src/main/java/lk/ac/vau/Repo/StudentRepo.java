package lk.ac.vau.Repo;
import lk.ac.vau.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends JpaRepository<Student,String> {
	
}
