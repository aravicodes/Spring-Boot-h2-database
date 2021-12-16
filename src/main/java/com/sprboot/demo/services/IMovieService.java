package com.sprboot.demo.services;

import java.util.List;

import com.sprboot.demo.dto.Movie;

public interface IMovieService {

	Movie addmovie(Movie m);

	List<Movie> getmovie();

	void delbyid(int mid);

	Movie updmovie(Movie m);

}
