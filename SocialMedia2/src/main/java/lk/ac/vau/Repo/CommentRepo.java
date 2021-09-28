package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.Model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
