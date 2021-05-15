package com.epam.learn.cinema.entities;

import java.util.Arrays;

public class Movie {
	private int movieId;
	private String name;
	private int duration;
	private byte[] image;
	
	public Movie() {}

	public Movie(int movieId, String name, int duration, byte[] image) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.duration = duration;
		this.image = image;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + movieId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(!(obj instanceof Movie)) {
			return false;
		}
		Movie movie = (Movie) obj;
		return movie.name.equals(getName());
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", duration=" + duration + "]";
	};
	
	
}
