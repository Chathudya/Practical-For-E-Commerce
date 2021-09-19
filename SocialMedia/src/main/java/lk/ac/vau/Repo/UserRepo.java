package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.Model.User;

public interface UserRepo extends JpaRepository<User, String> {

}
