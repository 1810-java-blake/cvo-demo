package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.Controllers.TrackAlbumArtistController;

@SuppressWarnings("serial")
public class SchinookServlet extends HttpServlet {
	
	TrackAlbumArtistController TaaController = new TrackAlbumArtistController();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
		super.service(req, resp);

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("chocolate");
		TaaController.getTrackAlbumArtist(req, resp);
	}
}
