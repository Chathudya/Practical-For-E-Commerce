package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class MusicCategories {
@Id
	private String musicCategoryId;
	private String musicCategoryName;
	@OneToMany(mappedBy = "musiccategories")
	public List <MusicAlbums> musicalbums;
	public MusicCategories() {
		
	}
	public MusicCategories(String musicCategoryId, String musicCategoryName, List<MusicAlbums> musicalbums) {
		super();
		this.musicCategoryId = musicCategoryId;
		this.musicCategoryName = musicCategoryName;
		this.musicalbums = musicalbums;
	}
	public String getMusicCategoryId() {
		return musicCategoryId;
	}
	public void setMusicCategoryId(String musicCategoryId) {
		this.musicCategoryId = musicCategoryId;
	}
	public String getMusicCategoryName() {
		return musicCategoryName;
	}
	public void setMusicCategoryName(String musicCategoryName) {
		this.musicCategoryName = musicCategoryName;
	}
	public List<MusicAlbums> getMusicalbums() {
		return musicalbums;
	}
	public void setMusicalbums(List<MusicAlbums> musicalbums) {
		this.musicalbums = musicalbums;
	}

	
}
