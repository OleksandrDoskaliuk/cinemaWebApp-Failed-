package com.epam.learn.cinema.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Session {
	private int sessionId;
	private int movieId;
	private int cinemaHallId;
	private Date startTime;
	
	public Session() {}

	public Session(int sessionId, int movieId, int cinemaHallId, Date startTime) {
		super();
		this.sessionId = sessionId;
		this.movieId = movieId;
		this.cinemaHallId = cinemaHallId;
		this.startTime = startTime;
	}
	
	public static Session createSession(int sessionId, int movieId, int cinemaHallId, Date startTime) {
		return new Session(sessionId, movieId, cinemaHallId, startTime);
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getCinemaHallId() {
		return cinemaHallId;
	}

	public void setCinemaHallId(int cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cinemaHallId;
		result = prime * result + movieId;
		result = prime * result + sessionId;
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Session)) {
			return false;
		}
		Session session = (Session) obj;
		return session.startTime.equals(getStartTime());
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = 
			     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "Session [sessionId=" + sessionId + ", movieId=" + movieId + ", cinemaHallId=" + cinemaHallId
				+ ", startTime=" + sdf.format(startTime) + "]";
	}
	
	
	
	
}
