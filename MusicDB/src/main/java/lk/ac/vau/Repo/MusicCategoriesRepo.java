package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.MusicCategories;

@Repository
public interface MusicCategoriesRepo extends JpaRepository <MusicCategories, String> {

}
