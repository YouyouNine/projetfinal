package com.ajc.projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.Commande;
import com.ajc.projetfinal.repo.CommandeRepository;

@RestController
@RequestMapping("/rest")
public class CommandeRestController {
	
	@Autowired
	private CommandeRepository repo;
	
	@CrossOrigin
	@GetMapping("/commande")
	public List<Commande> getAllCommandes() {
		return repo.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/commande")
	public void create(@RequestBody Commande commande) {
		this.repo.save(commande);
	}
}
