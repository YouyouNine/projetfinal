package com.ajc.projetfinal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajc.projetfinal.model.FormulaireService;
import com.ajc.projetfinal.repo.FormulaireServiceRepository;

@RestController
@RequestMapping("/formulaire")
public class FormulaireServiceRestController {

	@Autowired
	private FormulaireServiceRepository repo;
	
	@CrossOrigin
	@GetMapping("/hello")
	public String getHello() {
		// localhost:8080/formation/formulaire/hello -> le nom formation a été ajouté
		// dans l'application properties
		return "Hello";
	}
	
	// Pour la partie récupération du formulaire en bdd 
	
	@CrossOrigin
	@PostMapping("/service")
	public void formulaireSave (@RequestBody FormulaireService formulaireService){
		
		this.repo.save(formulaireService); 
	}
}
