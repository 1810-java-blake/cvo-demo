package com.revature.Daos;

import java.util.List;

import com.revature.Models.TrackAlbumArtist;

public interface TrackAlbumArtistDao {
	TrackAlbumArtistDao currentImpl = new TrackAlbumArtistDaoJdbc();
	
	List<TrackAlbumArtist> findTAA();
	
}
