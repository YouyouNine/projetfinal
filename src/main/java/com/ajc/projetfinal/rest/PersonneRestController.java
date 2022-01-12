package com.ajc.projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.Personne;
import com.ajc.projetfinal.repo.PersonneRepository;

@RestController
@RequestMapping("/rest")
public class PersonneRestController {

	@Autowired
	private PersonneRepository repo;
	
	@CrossOrigin
	@GetMapping("/hello")
	public String getHello() {
		// localhost:8080/formation/rest/hello -> le nom formation a été ajouté
		// dans l'application properties
		return "Hello";
	}

	@CrossOrigin
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
		Personne p = repo.findByUsername(username);
		
		if(p != null){
			System.out.println(" user ok");
			if(p.getPassword().equals(password)){
				System.out.println(" pass ok");
			} else {
				p = new Personne();
				p.setTitle("pass not ok");
			}
		} else {
			p = new Personne();
			p.setTitle("user not ok");;
		}

		System.out.println("**************************" + p);
		return repo.findByUsernameAndPassword(username, password);

	}
	
//	@CrossOrigin
//	@GetMapping("/personnes/{username}/{password}")
//	public ResponseEntity<Personne> findByUsernameAndPassword(@PathVariable(name = "username") String username,
//			@PathVariable(name = "password") String password) {
//		ResponseEntity<Personne> responseEntity;
//		Personne p = repo.findByUsername(username);
//		
//		if(p != null){
//			System.out.println(" user ok");
//			if(p.getPassword().equals(password)){
//				responseEntity = new ResponseEntity<Personne>(p,
//						HttpStatus.ACCEPTED);
//				System.out.println(" pass ok");
//			} else {
////				p = new Personne();
//				responseEntity = new ResponseEntity<Personne>(new Personne(),
//						HttpStatus.NOT_FOUND);
//				p.setTitle("pas not ok");
//			}
//		} else {
//			responseEntity = new ResponseEntity<Personne>(new Personne(),
//					HttpStatus.NO_CONTENT);
////			p = new Personne();
//			p.setTitle("user not ok");;
//		}
//
//		System.out.println("**************************" + p);
//		return responseEntity;
////		return repo.findByUsernameAndPassword(username, password);
//
//	}

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
