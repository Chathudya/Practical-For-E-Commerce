package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.AlbumTracks;

@Repository
public interface AlbumTracksRepo extends JpaRepository <AlbumTracks, String> {

}
