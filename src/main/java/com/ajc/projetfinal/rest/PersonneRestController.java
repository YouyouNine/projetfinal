package com.ajc.projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.Personne;
import com.ajc.projetfinal.repo.PersonneRepository;

@RestController
@RequestMapping("/rest")
public class PersonneRestController {
	
	@Autowired
	private PersonneRepository repo;
	
	@GetMapping("/hello")
	public String getHello() {
		//localhost:8080/formation/rest/hello   -> le nom formation a été ajouté dans l'application properties
		return "Hello";
	}
	
	@GetMapping("/personnes")
	public List<Personne> getAllPersonnes() {
		return repo.findAll();
	}
}
