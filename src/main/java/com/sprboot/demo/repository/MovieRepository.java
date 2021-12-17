package com.sprboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprboot.demo.dto.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer>{

}
