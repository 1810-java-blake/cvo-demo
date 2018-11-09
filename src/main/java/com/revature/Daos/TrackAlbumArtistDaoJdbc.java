package com.revature.Daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Models.TrackAlbumArtist;
import com.revature.Utilities.ConnectionUtil;

public class TrackAlbumArtistDaoJdbc implements TrackAlbumArtistDao {

	@Override
	public List<TrackAlbumArtist> findTAA() {
		try (Connection tConnection = ConnectionUtil.getConnection()) {
			PreparedStatement tPStatement = tConnection.prepareStatement(
				"SELECT track.name as trackName, album.title, artist.name FROM album "
				+ "INNER JOIN track ON track.albumid = album.albumid "
				+ "INNER JOIN artist ON artist.artistid = album.artistid;"
				);
			
			ResultSet result = tPStatement.executeQuery();
			
			List<TrackAlbumArtist> tList = new ArrayList<TrackAlbumArtist>();
			
			while (result.next()) {
				TrackAlbumArtist newItem = new TrackAlbumArtist(
						result.getString("trackname"), 
						result.getString("title"), 
						result.getString("name"));
				
				tList.add(newItem);
			}
			
			return tList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
