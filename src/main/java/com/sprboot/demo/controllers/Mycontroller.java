package com.sprboot.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprboot.demo.dto.Movie;
import com.sprboot.demo.services.IMovieService;

@RestController
public class Mycontroller {
	
	@Autowired
	IMovieService ms;
	
	@PostMapping("/addmovie")
	public String addmovie(@RequestBody Movie m){
		ms.addmovie(m);
		return "added ";
	}
	
	@GetMapping("/movies")
	public List<Movie> getmovie(){
		return ms.getmovie(); 
	}
	
	@DeleteMapping("/del/{mid}")
	public String delmovie(@PathVariable int mid) {
		ms.delbyid(mid);
		return "deleted";
	}
	@PutMapping("/updatemovie")
	public String updmovie(@RequestBody Movie m){
		ms.updmovie(m);
		return "updated ";
	}
	
}
