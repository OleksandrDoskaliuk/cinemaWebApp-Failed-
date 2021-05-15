package com.epam.learn.cinema.dao;

import java.util.List;

import com.epam.learn.cinema.entities.Movie;

public interface MovieDao {
	boolean create(Movie movie) throws DaoException;
	
	Movie findMovieById(int id) throws DaoException;
	List<Movie> findAll() throws DaoException;
	Movie findMovieByName(String name) throws DaoException;
	
	Movie update(Movie movie) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Movie movie) throws DaoException;
}
