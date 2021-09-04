package lk.ac.vau.Model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class MusicAlbums {
@Id
	private String albumId;
	private String albumTitle;
	private int releasedYear;
	private int noOfTracks;
	@ManyToOne
	@JoinColumn(name="artist_id",referencedColumnName = "artistId")
	private Artists artists;
	
	@ManyToOne
	@JoinColumn(name="category_id",referencedColumnName = "musicCategoryId")
	private MusicCategories musiccategories;
	
	@OneToMany(mappedBy = "musicalbums")
	public List <AlbumTracks> albumtracks;
	
	public MusicAlbums() {
		
	
	}

	public MusicAlbums(String albumId, String albumTitle, int releasedYear, int noOfTracks, Artists artists,
			MusicCategories musiccategories, List<AlbumTracks> albumtracks) {
		super();
		this.albumId = albumId;
		this.albumTitle = albumTitle;
		this.releasedYear = releasedYear;
		this.noOfTracks = noOfTracks;
		this.artists = artists;
		this.musiccategories = musiccategories;
		this.albumtracks = albumtracks;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	public int getNoOfTracks() {
		return noOfTracks;
	}

	public void setNoOfTracks(int noOfTracks) {
		this.noOfTracks = noOfTracks;
	}

	public Artists getArtists() {
		return artists;
	}

	public void setArtists(Artists artists) {
		this.artists = artists;
	}

	public MusicCategories getMusiccategories() {
		return musiccategories;
	}

	public void setMusiccategories(MusicCategories musiccategories) {
		this.musiccategories = musiccategories;
	}

	public List<AlbumTracks> getAlbumtracks() {
		return albumtracks;
	}

	public void setAlbumtracks(List<AlbumTracks> albumtracks) {
		this.albumtracks = albumtracks;
	}
	
	
}
