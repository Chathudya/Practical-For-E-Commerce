package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.MusicAlbums;

@Repository
public interface MusicAlbumsRepo extends JpaRepository <MusicAlbums, String>{

}
