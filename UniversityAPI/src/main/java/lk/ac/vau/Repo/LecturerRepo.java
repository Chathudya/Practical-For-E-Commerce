package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.Model.Lecturer;

public interface LecturerRepo extends JpaRepository<Lecturer, String> {

}
