package com.ajc.projetfinal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajc.projetfinal.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, String>{
	List<Commande> findByNom(String nom);
}
