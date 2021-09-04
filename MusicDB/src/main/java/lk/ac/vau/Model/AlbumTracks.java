package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AlbumTracks {
	@Id
	private String trackId;
	private String trackNo;
	private String trackTitle;
	private double trackLength;
	
	@ManyToOne
	@JoinColumn(name="AlbumId", referencedColumnName = "albumId")
	private MusicAlbums musicalbums;
	
	public AlbumTracks() {
		
	}

	public AlbumTracks(String trackId, String trackNo, String trackTitle, double trackLength, MusicAlbums musicalbums) {
		super();
		this.trackId = trackId;
		this.trackNo = trackNo;
		this.trackTitle = trackTitle;
		this.trackLength = trackLength;
		this.musicalbums = musicalbums;
	}

	public String getTrackId() {
		return trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public String getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

	public String getTrackTitle() {
		return trackTitle;
	}

	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}

	public double getTrackLength() {
		return trackLength;
	}

	public void setTrackLength(double trackLength) {
		this.trackLength = trackLength;
	}

	public MusicAlbums getMusicalbums() {
		return musicalbums;
	}

	public void setMusicalbums(MusicAlbums musicalbums) {
		this.musicalbums = musicalbums;
	}

}