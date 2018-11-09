package com.revature.Controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.Daos.TrackAlbumArtistDao;
import com.revature.Utilities.ResponseMapper;

public class TrackAlbumArtistController {
	
	TrackAlbumArtistDao TaaDao = TrackAlbumArtistDao.currentImpl;
	
	public void getTrackAlbumArtist(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		ResponseMapper.convertAndAttach(TaaDao.findTAA(), resp);
		return;
	}
}
