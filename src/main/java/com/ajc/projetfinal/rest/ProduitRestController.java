package com.ajc.projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.Produit;
import com.ajc.projetfinal.repo.ProduitRepository;
//@SpringBootApplication
//@EnableJpaRepositories("com.ajc.projetfinal.repo")
@RestController
@RequestMapping("/rest")
public class ProduitRestController {

	@Autowired
	private ProduitRepository repo;

	@GetMapping("/hello1")
	public String getHello() {
		// localhost:8080/formation/rest/hello -> le nom formation a été ajouté
		// dans l'application properties
		return "Hello";
	}

	@GetMapping("/produit")
	public List<Produit> getAllPersonnes() {
		return repo.findAll();
	}

	// Pour la partie inscription
	@CrossOrigin
	@PostMapping("/produit")
	public void create(@RequestBody Produit personne) {
		this.repo.save(personne);
	}



}
