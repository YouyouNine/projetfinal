package com.ajc.projetfinal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.Newsletter;
import com.ajc.projetfinal.model.Personne;
import com.ajc.projetfinal.repo.NewsletterRepository;

@RestController
@RequestMapping("/newsletter")
public class NewsletterRestController {

	@Autowired
	private NewsletterRepository repo; 
	

	@CrossOrigin
	@GetMapping("/hello")
	public String getHello() {
		// localhost:8080/formation/newsletter/hello -> le nom formation a été ajouté
		// dans l'application properties
		return "Hello";
	}
	
	@CrossOrigin
	@PostMapping("/email/{email}")
	public void create(@RequestBody Newsletter newsletter) {
		System.out.println("test");
		this.repo.save(newsletter);

	}
}
