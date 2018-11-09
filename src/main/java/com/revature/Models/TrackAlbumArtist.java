package com.revature.Models;

public class TrackAlbumArtist {
	
	private String trackName;
	private String albumName;
	private String artistName;
	
	public TrackAlbumArtist(String trackName, String albumName, String artistName) {
		super();
		this.trackName = trackName;
		this.albumName = albumName;
		this.artistName = artistName;
	}
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
}
