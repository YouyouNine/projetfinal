package com.ajc.projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@CrossOrigin
	@GetMapping("/hello1")
	public String getHello() {
		// localhost:8080/formation/rest/hello -> le nom formation a été ajouté
		// dans l'application properties
		return "Hello";
	}
	
	@CrossOrigin
	@GetMapping("/produit")
	public List<Produit> getAllPersonnes() {
		return repo.findAll();
	}
	
	@CrossOrigin
	@GetMapping("/produit/{id}")
	public Produit getId(@PathVariable(name = "id") int id) {
		System.out.println("toto******************");
		return repo.findById(id).get();
	}

	// Pour la partie inscription
	@CrossOrigin
	@PostMapping("/produit")
	public void create(@RequestBody Produit personne) {
		this.repo.save(personne);
	}
	
	@CrossOrigin
	@GetMapping("/produit/nom/{nom}")
	public List<Produit> findByMarque(@PathVariable(name = "nom") String nom) {

		return this.repo.findByNomContaining(nom);
	}
	
	@CrossOrigin
	@GetMapping("/produit/prix/{min}/{max}")
	public List<Produit> findByPrix(@PathVariable(name = "min") int min, @PathVariable(name = "max") int max) {
		System.out.println("toto");
		return this.repo.findByPrixBetween(min, max);
	}

	

}
