package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Artists {
@Id
	private String artistId;
	private String artistName;
	@OneToMany(mappedBy = "artists")
	public List <MusicAlbums> musicalbums;
	public Artists() {
		
	}
	public Artists(String artistId, String artistName, List<MusicAlbums> musicalbums) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.musicalbums = musicalbums;
	}
	public String getArtistId() {
		return artistId;
	}
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public List<MusicAlbums> getMusicalbums() {
		return musicalbums;
	}
	public void setMusicalbums(List<MusicAlbums> musicalbums) {
		this.musicalbums = musicalbums;
	}
	
    
	
}
