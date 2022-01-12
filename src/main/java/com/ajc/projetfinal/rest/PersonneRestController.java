package com.ajc.projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.Personne;
import com.ajc.projetfinal.repo.PersonneRepository;
@SpringBootApplication
@EnableJpaRepositories("com.ajc.projetfinal.repo")
@RestController
@RequestMapping("/rest")
public class PersonneRestController {

	@Autowired
	private PersonneRepository repo;

	@GetMapping("/hello")
	public String getHello() {
		// localhost:8080/formation/rest/hello -> le nom formation a été ajouté
		// dans l'application properties
		return "Hello";
	}

	@GetMapping("/personnes")
	public List<Personne> getAllPersonnes() {
		return repo.findAll();
	}

	// Pour la partie inscription
	@CrossOrigin
	@PostMapping("/personnes")
	public void create(@RequestBody Personne personne) {

		this.repo.save(personne);

	}

	// Pour la partie connexion

	@CrossOrigin
	@GetMapping("/personnes/{username}/{password}")
	public Personne findByUserAndPass(@PathVariable(name = "username") String username,
			@PathVariable(name = "password") String password) {
//		Personne p = new Personne();
//		p.setEmail("hello");
//		return p;
		return repo.findByUsernameAndPassword(username, password);

	}

	// @CrossOrigin
	// @PostMapping("/personnes")
	// public String create(@RequestBody Personne personne) {
	// System.out.println(personne);
	// if (!this.repo.existsById(personne.getEmail())) {
	// this.repo.save(personne);
	// return "Client créé";
	// } else {
	// return "Erreur, Client existe déjà";
	// }
	// }

}
